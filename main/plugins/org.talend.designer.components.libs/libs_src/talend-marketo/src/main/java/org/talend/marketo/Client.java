package org.talend.marketo;

import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;

import com.marketo.www.mktows.ActivityRecord;
import com.marketo.www.mktows.ActivityType;
import com.marketo.www.mktows.ActivityTypeFilter;
import com.marketo.www.mktows.Attribute;
import com.marketo.www.mktows.CampaignRecord;
import com.marketo.www.mktows.ForeignSysType;
import com.marketo.www.mktows.LastUpdateAtSelector;
import com.marketo.www.mktows.LeadActivityList;
import com.marketo.www.mktows.LeadChangeRecord;
import com.marketo.www.mktows.LeadKey;
import com.marketo.www.mktows.LeadKeyRef;
import com.marketo.www.mktows.LeadRecord;
import com.marketo.www.mktows.LeadSelector;
import com.marketo.www.mktows.ListKey;
import com.marketo.www.mktows.ListKeyType;
import com.marketo.www.mktows.ListOperationType;
import com.marketo.www.mktows.MObjFieldMetadata;
import com.marketo.www.mktows.MObjectMetadata;
import com.marketo.www.mktows.MktMktowsApiService;
import com.marketo.www.mktows.MktMktowsApiServiceLocator;
import com.marketo.www.mktows.MktowsPort;
import com.marketo.www.mktows.ParamsDescribeMObject;
import com.marketo.www.mktows.ParamsGetCampaignsForSource;
import com.marketo.www.mktows.ParamsGetLead;
import com.marketo.www.mktows.ParamsGetLeadActivity;
import com.marketo.www.mktows.ParamsGetLeadChanges;
import com.marketo.www.mktows.ParamsGetMultipleLeads;
import com.marketo.www.mktows.ParamsListMObjects;
import com.marketo.www.mktows.ParamsListOperation;
import com.marketo.www.mktows.ParamsSyncLead;
import com.marketo.www.mktows.ParamsSyncMultipleLeads;
import com.marketo.www.mktows.ReqCampSourceType;
import com.marketo.www.mktows.ResultDescribeMObject;
import com.marketo.www.mktows.ResultGetCampaignsForSource;
import com.marketo.www.mktows.ResultGetLead;
import com.marketo.www.mktows.ResultGetLeadChanges;
import com.marketo.www.mktows.ResultGetMultipleLeads;
import com.marketo.www.mktows.ResultListOperation;
import com.marketo.www.mktows.ResultSyncLead;
import com.marketo.www.mktows.ResultSyncMultipleLeads;
import com.marketo.www.mktows.StreamPosition;
import com.marketo.www.mktows.SuccessDescribeMObject;
import com.marketo.www.mktows.SuccessGetCampaignsForSource;
import com.marketo.www.mktows.SuccessGetLead;
import com.marketo.www.mktows.SuccessGetLeadActivity;
import com.marketo.www.mktows.SuccessGetLeadChanges;
import com.marketo.www.mktows.SuccessGetMultipleLeads;
import com.marketo.www.mktows.SuccessListMObjects;
import com.marketo.www.mktows.SuccessListOperation;
import com.marketo.www.mktows.SuccessSyncLead;
import com.marketo.www.mktows.SuccessSyncMultipleLeads;

// ============================================================================
//
// Copyright (C) 2006-2015 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================

/**
 * DOC bchen class global comment. Detailled comment
 */
public class Client {

    private MktowsPort stub = null;

    public Client(String endpoint, String secretKey, String clientAccessID) throws ServiceException, MalformedURLException {
        // 1. change the endpoint.
        MktMktowsApiService service = new MktMktowsApiServiceLocator();
        ((MktMktowsApiServiceLocator) service).setMktowsApiSoapPortEndpointAddress(endpoint);
        URL portAddress = new URL(endpoint);
        stub = service.getMktowsApiSoapPort(portAddress);
        // 2.assign secretKey and clientAccessID
        stub.setSecretKey(secretKey);
        stub.setClientAccessID(clientAccessID);
    }

    public void setTimeout(int timeout) {
        stub.setTimeout(timeout);
    }

    public ResultGetLead getLead(String keyType, String keyValue) throws Exception {
        ParamsGetLead paramsGetLead = new ParamsGetLead();
        paramsGetLead.setLeadKey(getLeadKey(keyType, keyValue));
        SuccessGetLead successLead = stub.getLead(paramsGetLead);
        ResultGetLead result = successLead.getResult();
        return result;
    }

    // public String outputExceptionFilter(AxisFault axisFault) throws Exception {
    // String fault = axisFault.getFaultString();
    // if (fault != null && !"".equals(fault)) {
    // if (MarketoException.outputExceptions.contains(fault.substring(0, 5))) {
    // return fault;
    // }
    // }
    // throw axisFault;
    // }

    public String inputExceptionFilter(AxisFault axisFault) throws Exception {
        String fault = axisFault.getFaultString();
        if (fault != null && !"".equals(fault)) {
            if (MarketoException.inputExceptions.contains(fault.substring(0, 5))) {
                return fault;
            }
        }
        throw axisFault;
    }

    public boolean isSystemError(AxisFault axisFault) {
        String fault = axisFault.getFaultString();
        if (fault != null && !"".equals(fault)) {
            if ("100".equals(fault.substring(0, 3)) || "200".equals(fault.substring(0, 3))) {
                return true;
            }
        }
        return false;
    }

    public ResultGetMultipleLeads getMultipleLeads(String[] includeAttributes, int batchSize, String streamPosition,
    		LeadSelector leadSelector) throws Exception {
        ParamsGetMultipleLeads paramsGetMultipleLeads = new ParamsGetMultipleLeads();
        paramsGetMultipleLeads.setIncludeAttributes(includeAttributes);
        paramsGetMultipleLeads.setBatchSize(batchSize > 1000 ? 1000 : batchSize);
        paramsGetMultipleLeads.setStreamPosition(streamPosition);
        if(leadSelector!=null){
        	if(leadSelector instanceof LastUpdateAtSelector){
        		LastUpdateAtSelector lastLeadSelector = (LastUpdateAtSelector) leadSelector;
        		if (lastLeadSelector.getOldestUpdatedAt() != null) {
        			paramsGetMultipleLeads.setLeadSelector(leadSelector);
                }else{
                	paramsGetMultipleLeads.setLastUpdatedAt(lastLeadSelector.getLatestUpdatedAt());
        		}
        	}else{
        		paramsGetMultipleLeads.setLeadSelector(leadSelector);
        	}
        }
        SuccessGetMultipleLeads successLeads = stub.getMultipleLeads(paramsGetMultipleLeads);
        ResultGetMultipleLeads result = successLeads.getResult();
        return result;
    }

    public LeadActivityList getLeadActivity(String keyType, String keyValue, int batchSize, String[] includeTypes,
            String[] excludeTypes, StreamPosition streamPosition) throws Exception {
        ParamsGetLeadActivity paramsGetLeadActivity = new ParamsGetLeadActivity();

        paramsGetLeadActivity.setLeadKey(getLeadKey(keyType, keyValue));
        paramsGetLeadActivity.setBatchSize(batchSize > 100 ? 100 : batchSize);
        paramsGetLeadActivity.setActivityFilter(getActivityTypeFilter(includeTypes, excludeTypes));
        paramsGetLeadActivity.setStartPosition(streamPosition);

        SuccessGetLeadActivity successActivity = stub.getLeadActivity(paramsGetLeadActivity);
        return successActivity.getLeadActivityList();
    }

    public ResultGetLeadChanges getLeadChanges(int batchSize, String[] includeTypes, String[] excludeTypes,
            StreamPosition startPosition, LeadSelector leadSelector) throws Exception {
        ParamsGetLeadChanges paramsGetLeadChanges = new ParamsGetLeadChanges();

        paramsGetLeadChanges.setActivityFilter(getActivityTypeFilter(includeTypes, excludeTypes));
        paramsGetLeadChanges.setBatchSize(batchSize > 100 ? 100 : batchSize);
        paramsGetLeadChanges.setStartPosition(startPosition);
        if (leadSelector instanceof LastUpdateAtSelector) {
            LastUpdateAtSelector lastLeadSelector = (LastUpdateAtSelector) leadSelector;
            if (lastLeadSelector.getOldestUpdatedAt() != null) {
                paramsGetLeadChanges.setLeadSelector(leadSelector);
            }
        }

        SuccessGetLeadChanges successChanges = stub.getLeadChanges(paramsGetLeadChanges);
        ResultGetLeadChanges result = successChanges.getResult();
        return result;
    }

    public ResultSyncLead syncLead(boolean returnLead, String marketoCookie, LeadRecord leadRecord) throws Exception {
        ParamsSyncLead paramsSyncLead = new ParamsSyncLead();

        paramsSyncLead.setLeadRecord(leadRecord);
        paramsSyncLead.setMarketoCookie(marketoCookie);
        paramsSyncLead.setReturnLead(returnLead);
        SuccessSyncLead successSyncLead = stub.syncLead(paramsSyncLead);
        return successSyncLead.getResult();
    }

    public ResultSyncMultipleLeads syncMultipleLeads(boolean dedupEnabled, LeadRecord[] leadRecordList) throws Exception {
        ParamsSyncMultipleLeads paramsSyncMultipleLeads = new ParamsSyncMultipleLeads();
        paramsSyncMultipleLeads.setDedupEnabled(dedupEnabled);
        paramsSyncMultipleLeads.setLeadRecordList(leadRecordList);
        SuccessSyncMultipleLeads successSyncLeads = stub.syncMultipleLeads(paramsSyncMultipleLeads);
        return successSyncLeads.getResult();
    }

    public ResultListOperation listOperation(String operationType, String listKeyType, String listKeyValue, LeadKey[] leadKeys,
            boolean strict) throws Exception {
        ParamsListOperation paramsListOperation = new ParamsListOperation();
        paramsListOperation.setStrict(strict);
        ListKey listKey = new ListKey();
        listKey.setKeyValue(listKeyValue);
        listKey.setKeyType(ListKeyType.fromString(listKeyType));
        paramsListOperation.setListKey(listKey);
        paramsListOperation.setListMemberList(leadKeys);
        paramsListOperation.setListOperation(ListOperationType.fromString(operationType));
        SuccessListOperation successListOperation = stub.listOperation(paramsListOperation);
        return successListOperation.getResult();
    }

    public LeadRecord buildLead(Map<String, String> leadAllAttrList) {
        String email = leadAllAttrList.get("Email");
        leadAllAttrList.remove("Email");
        String foreignSysPersonId = leadAllAttrList.get("ForeignSysPersonId");
        leadAllAttrList.remove("ForeignSysPersonId");
        String foreignSysType = leadAllAttrList.get("ForeignSysType");
        leadAllAttrList.remove("ForeignSysType");
        String id = leadAllAttrList.get("Id");
        leadAllAttrList.remove("Id");
        return buildLead(id, email, foreignSysPersonId, foreignSysType, leadAllAttrList);
    }

    public LeadRecord buildLead(String id, String email, String foreignSysPersonId, String foreignSysType,
            Map<String, String> leadAttrList) {
        LeadRecord leadRecord = new LeadRecord();
        if (email != null && !"".equals(email)) {
            leadRecord.setEmail(email);
        }
        if (foreignSysPersonId != null && !"".equals(foreignSysPersonId)) {
            leadRecord.setForeignSysPersonId(foreignSysPersonId);
        }
        if (foreignSysType != null && !"".equals(foreignSysType)) {
            leadRecord.setForeignSysType(ForeignSysType.fromString(foreignSysType));
        }
        if (id != null && !"".equals(id)) {
            leadRecord.setId(Integer.valueOf(id));
        }
        leadRecord.setLeadAttributeList(buildAttr(leadAttrList));
        return leadRecord;
    }

    public ResultGetCampaignsForSource getCampaignsForSource(String name, boolean exactName, String source) throws Exception {
        ParamsGetCampaignsForSource paramsGetCampaignsForSource = new ParamsGetCampaignsForSource();
        paramsGetCampaignsForSource.setName(name);
        paramsGetCampaignsForSource.setExactName(exactName);
        paramsGetCampaignsForSource.setSource(ReqCampSourceType.fromString(source));

        SuccessGetCampaignsForSource successCampaigns = stub.getCampaignsForSource(paramsGetCampaignsForSource);
        ResultGetCampaignsForSource result = successCampaigns.getResult();
        return result;
    }

    private Attribute[] buildAttr(Map<String, String> attrSourceList) {
        if (attrSourceList == null || attrSourceList.isEmpty()) {
            return null;// null or ?
        }
        List<Attribute> attrList = new ArrayList<Attribute>();
        Attribute attr = null;
        for (String key : attrSourceList.keySet()) {
            attr = new Attribute();
            attr.setAttrName(key);
            attr.setAttrValue(attrSourceList.get(key));// not null
            attrList.add(attr);
        }
        return attrList.toArray(new Attribute[attrList.size()]);
    }

    public LeadKey getLeadKey(String keyType, String keyValue) {
        LeadKey leadKey = new LeadKey();
        leadKey.setKeyType(LeadKeyRef.fromString(keyType));
        leadKey.setKeyValue(keyValue);
        return leadKey;
    }

    private ActivityTypeFilter getActivityTypeFilter(String[] includeTypes, String[] excludeTypes) {
        ActivityTypeFilter activityFilter = new ActivityTypeFilter();
        if (includeTypes != null) {
            List<ActivityType> inTypes = new ArrayList<ActivityType>();
            for (String includeType : includeTypes) {
                inTypes.add(ActivityType.fromString(includeType));
            }
            activityFilter.setIncludeTypes(inTypes.toArray(new ActivityType[inTypes.size()]));
        } else {
            activityFilter.setIncludeTypes(null);
        }
        if (excludeTypes != null) {
            List<ActivityType> exTypes = new ArrayList<ActivityType>();
            for (String excludeType : excludeTypes) {
                exTypes.add(ActivityType.fromString(excludeType));
            }
            activityFilter.setExcludeTypes(exTypes.toArray(new ActivityType[exTypes.size()]));
        } else {
            activityFilter.setExcludeTypes(null);
        }
        return activityFilter;
    }

    public Map<String, String> readLead(LeadRecord leadRecord) {
        Map<String, String> lead = new HashMap<String, String>();
        lead.put("Id", String.valueOf(leadRecord.getId()));
        lead.put("Email", leadRecord.getEmail());
        lead.put("ForeignSysPersonId", leadRecord.getForeignSysPersonId());
        lead.put("ForeignSysType", leadRecord.getForeignSysType() != null ? leadRecord.getForeignSysType().getValue() : null);

        Attribute[] attributes = leadRecord.getLeadAttributeList();
        if (attributes != null) {
            for (Attribute attr : attributes) {
                lead.put(attr.getAttrName(), attr.getAttrValue());
            }
        }
        return lead;
    }

    public Map<String, String> readActivity(ActivityRecord record) {
        Map<String, String> activity = new HashMap<String, String>();
        activity.put("Id", String.valueOf(record.getId()));
        Calendar calendardate = record.getActivityDateTime();
        String strdate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.000Z'");
        if (calendardate != null) {
            strdate = sdf.format(calendardate.getTime());
        }
        activity.put("ActivityDateTime", strdate);
        activity.put("ActivityType", record.getActivityType());
        activity.put("MktgAssetName", record.getMktgAssetName());
        activity.put("MktPersonId", record.getMktPersonId());
        activity.put("Campaign", record.getCampaign());
        activity.put("ForeignSysId", record.getForeignSysId());
        activity.put("PersonName", record.getPersonName());
        activity.put("OrgName", record.getOrgName());
        activity.put("ForeignSysOrgId", record.getForeignSysOrgId());

        Attribute[] attributes = record.getActivityAttributes();
        if (attributes != null) {
            for (Attribute attr : attributes) {
                activity.put(attr.getAttrName(), attr.getAttrValue());
            }
        }
        return activity;
    }

    public Map<String, String> readChange(LeadChangeRecord record) {
        Map<String, String> change = new HashMap<String, String>();
        change.put("Id", String.valueOf(record.getId()));
        Calendar calendardate = record.getActivityDateTime();
        String strdate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.000Z'");
        if (calendardate != null) {
            strdate = sdf.format(calendardate.getTime());
        }
        change.put("ActivityDateTime", strdate);
        change.put("ActivityType", record.getActivityType());
        change.put("MktgAssetName", record.getMktgAssetName());
        change.put("MktPersonId", record.getMktPersonId());
        change.put("Campaign", record.getCampaign());

        Attribute[] attributes = record.getActivityAttributes();
        if (attributes != null) {
            for (Attribute attr : attributes) {
                change.put(attr.getAttrName(), attr.getAttrValue());
            }
        }
        return change;
    }

    public Map<String, String> readCampaign(CampaignRecord record) {
        Map<String, String> campaign = new HashMap<String, String>();
        campaign.put("Id", String.valueOf(record.getId()));
        campaign.put("Name", record.getName());
        campaign.put("Decription", record.getDescription());
        return campaign;

    }

    public static void main(String[] args) {
        String endpoint = "https://na-c.marketo.com/soap/mktows/1_5";
        String secretKey = "464407637703554044DD11AA22119989EE33379AD840";
        String clientAccessID = "mktodemo41_785133934D1A2197E30463";
        try {
            Client client = new Client(endpoint, secretKey, clientAccessID);
            client.printMObjects();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void printMObjects() throws Exception {
        int columnSize = 80;
        FileWriter outFile = new FileWriter("MarketoMetadata.txt");

        List<String> mobjects = null;
        // mobjects = listNameOfMObjects();// result:ActivityRecord,LeadRecord
        // listNameOfMObjects only retrieve two mobjects, so add manul
        mobjects = new ArrayList<String>();
        mobjects.add("ActivityRecord");
        mobjects.add("LeadRecord");
        // "Company" "Activity" "Lead" are can't be supported now
        // mobjects.add("Company");
        // mobjects.add("Activity");
        // mobjects.add("Lead");

        for (String mobject : mobjects) {
            MObjectMetadata mobjectMeta = getMetadata(mobject);

            // 5.print the details
            outFile.append("------" + mobject + "--details----");
            outFile.append(System.getProperty("line.separator"));
            printMObjectHeader(new String[] { "Name", "Description", "isCustom", "isVirtual" }, outFile, columnSize);
            List<String> mObjectDetails = new ArrayList<String>();
            mObjectDetails.add(mobjectMeta.getName());
            mObjectDetails.add(mobjectMeta.getDescription());
            mObjectDetails.add(String.valueOf(mobjectMeta.isIsCustom()));
            mObjectDetails.add(String.valueOf(mobjectMeta.isIsVirtual()));
            printMObject(mObjectDetails.toArray(new String[mObjectDetails.size()]), outFile, columnSize);

            MObjFieldMetadata[] fields = mobjectMeta.getFieldList();
            outFile.append("-------------metadata-------------");
            outFile.append(System.getProperty("line.separator"));
            String[] metadataHeaders = new String[] { "Name", "DisplayName", "Description", "isPrimaryKey", "isReadonly",
                    "DataType", "Size", "isUpdateBlocked", "isCustom", "isDynamic", "dynamicFieldRef", "sourceObject", "isName",
                    "updateAt" };
            printMetadataHeader(metadataHeaders, outFile, columnSize);
            for (MObjFieldMetadata field : fields) {
                List<String> metadataList = new ArrayList<String>();
                metadataList.add(field.getName());
                metadataList.add(field.getDisplayName());
                metadataList.add(field.getDescription());
                metadataList.add(String.valueOf(field.isIsPrimaryKey()));
                metadataList.add(String.valueOf(field.isIsReadonly()));
                metadataList.add(field.getDataType());
                metadataList.add(String.valueOf(field.getSize()));
                metadataList.add(String.valueOf(field.isIsUpdateBlocked()));
                metadataList.add(String.valueOf(field.isIsCustom()));
                metadataList.add(String.valueOf(field.isIsDynamic()));
                metadataList.add(field.getDynamicFieldRef());
                metadataList.add(field.getSourceObject());
                metadataList.add(String.valueOf(field.getIsName()));
                metadataList.add(String.valueOf(field.getUpdatedAt().toString()));
                printMetadata(metadataList.toArray(new String[metadataList.size()]), outFile, columnSize);
            }
        }
        outFile.close();
    }

    // 3.getMetadata
    public List<String> listNameOfMObjects() throws RemoteException {
        List<String> mObjectList = new ArrayList<String>();
        SuccessListMObjects mObjects = stub.listMObjects(new ParamsListMObjects());
        String[] mObjectsResult = mObjects.getResult();
        for (String result : mObjectsResult) {
            // result:ActivityRecord,LeadRecord
            mObjectList.add(result);
        }
        return mObjectList;
    }

    // 4.describe MObjects
    public MObjectMetadata getMetadata(String MObjectName) throws RemoteException {
        ParamsDescribeMObject mobject = new ParamsDescribeMObject();
        mobject.setObjectName(MObjectName);
        SuccessDescribeMObject mobjectDescribe = stub.describeMObject(mobject);
        ResultDescribeMObject mobjectDescribeResult = mobjectDescribe.getResult();
        MObjectMetadata mobjectMeta = mobjectDescribeResult.getMetadata();
        return mobjectMeta;
    }

    public void printMObjectHeader(String[] MObjectHeaders, FileWriter outFile, int columnSize) throws Exception {
        for (String metadata : MObjectHeaders) {
            outFile.append("|");
            outFile.append(metadata);
            int emptySize = columnSize - metadata.length();
            while (emptySize > 0) {
                outFile.append(" ");
                emptySize--;
            }
        }
        outFile.append("|" + System.getProperty("line.separator"));
    }

    public void printMObject(String[] MObject, FileWriter outFile, int columnSize) throws Exception {
        for (String metadata : MObject) {
            outFile.append("|");
            outFile.append(metadata);
            int emptySize = metadata != null ? columnSize - metadata.length() : columnSize - 4;
            while (emptySize > 0) {
                outFile.append(" ");
                emptySize--;
            }
        }
        outFile.append("|" + System.getProperty("line.separator"));
    }

    public void printMetadataHeader(String[] metadataHeaders, FileWriter outFile, int columnSize) throws Exception {
        for (String metadata : metadataHeaders) {
            outFile.append("|");
            outFile.append(metadata);
            int emptySize = columnSize - metadata.length();
            while (emptySize > 0) {
                outFile.append(" ");
                emptySize--;
            }
        }
        outFile.append("|" + System.getProperty("line.separator"));
    }

    public void printMetadata(String[] metadatas, FileWriter outFile, int columnSize) throws Exception {
        for (String metadata : metadatas) {
            outFile.append("|");
            outFile.append(metadata);
            int emptySize = metadata != null ? columnSize - metadata.length() : columnSize - 4;
            while (emptySize > 0) {
                outFile.append(" ");
                emptySize--;
            }
        }
        outFile.append("|" + System.getProperty("line.separator"));
    }
}
