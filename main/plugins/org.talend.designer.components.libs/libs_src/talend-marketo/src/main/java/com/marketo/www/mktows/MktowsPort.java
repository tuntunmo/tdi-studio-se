/**
 * MktowsPort.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.marketo.www.mktows;

public interface MktowsPort extends java.rmi.Remote {

	public int getTimeout();

	public void setTimeout(int timeout);

	public String getClientAccessID();

	public void setClientAccessID(String clientAccessID);

	public String getSecretKey();

	public void setSecretKey(String secretKey);

	/**
	 * Delete one or more MObject.
	 */
	public com.marketo.www.mktows.SuccessDeleteMObjects deleteMObjects(
			com.marketo.www.mktows.ParamsDeleteMObjects paramsDeleteMObjects)
			throws java.rmi.RemoteException;

	/**
	 * Get meta data for a MObject.
	 */
	public com.marketo.www.mktows.SuccessDescribeMObject describeMObject(
			com.marketo.www.mktows.ParamsDescribeMObject paramsDescribeMObject)
			throws java.rmi.RemoteException;

	/**
	 * Get one or more MObject.
	 */
	public com.marketo.www.mktows.SuccessGetMObjects getMObjects(
			com.marketo.www.mktows.ParamsGetMObjects paramsGetMObjects)
			throws java.rmi.RemoteException;

	/**
	 * Create, update, or upsert MObject.
	 */
	public com.marketo.www.mktows.SuccessSyncMObjects syncMObjects(
			com.marketo.www.mktows.ParamsSyncMObjects paramsSyncMObjects)
			throws java.rmi.RemoteException;

	/**
	 * Get a list campaigns.
	 */
	public com.marketo.www.mktows.SuccessGetCampaignsForSource getCampaignsForSource(
			com.marketo.www.mktows.ParamsGetCampaignsForSource paramsGetCampaignsForSource)
			throws java.rmi.RemoteException;

	/**
	 * Provides information regarding the status of list import.
	 */
	public com.marketo.www.mktows.SuccessGetImportToListStatus getImportToListStatus(
			com.marketo.www.mktows.ParamsGetImportToListStatus paramsGetImportToListStatus)
			throws java.rmi.RemoteException;

	/**
	 * Get all details about a lead.
	 */
	public com.marketo.www.mktows.SuccessGetLead getLead(
			com.marketo.www.mktows.ParamsGetLead paramsGetLead)
			throws java.rmi.RemoteException;

	/**
	 * Get all activity log details about a lead.
	 */
	public com.marketo.www.mktows.SuccessGetLeadActivity getLeadActivity(
			com.marketo.www.mktows.ParamsGetLeadActivity paramsGetLeadActivity)
			throws java.rmi.RemoteException;

	/**
	 * Get changes for all leads.
	 */
	public com.marketo.www.mktows.SuccessGetLeadChanges getLeadChanges(
			com.marketo.www.mktows.ParamsGetLeadChanges paramsGetLeadChanges)
			throws java.rmi.RemoteException;

	/**
	 * Get all details about one or more leads.
	 */
	public com.marketo.www.mktows.SuccessGetMultipleLeads getMultipleLeads(
			com.marketo.www.mktows.ParamsGetMultipleLeads paramsGetMultipleLeads)
			throws java.rmi.RemoteException;

	/**
	 * Imports the list from web file info
	 */
	public com.marketo.www.mktows.SuccessImportToList importToList(
			com.marketo.www.mktows.ParamsImportToList paramsImportToList)
			throws java.rmi.RemoteException;

	/**
	 * Send a Marketo email.
	 */
	public com.marketo.www.mktows.SuccessListMObjects listMObjects(
			com.marketo.www.mktows.ParamsListMObjects paramsListMObjects)
			throws java.rmi.RemoteException;

	/**
	 * Perform an operation on a Marketo List, like add lead or remove lead.
	 */
	public com.marketo.www.mktows.SuccessListOperation listOperation(
			com.marketo.www.mktows.ParamsListOperation paramsListOperation)
			throws java.rmi.RemoteException;

	/**
	 * Request to add a set of leads to a campaign.
	 */
	public com.marketo.www.mktows.SuccessRequestCampaign requestCampaign(
			com.marketo.www.mktows.ParamsRequestCampaign paramsRequestCampaign)
			throws java.rmi.RemoteException;

	/**
	 * Request to add tokens to a schedule campaign.
	 */
	public com.marketo.www.mktows.SuccessScheduleCampaign scheduleCampaign(
			com.marketo.www.mktows.ParamsScheduleCampaign paramsScheduleCampaign)
			throws java.rmi.RemoteException;

	/**
	 * Create or update a lead.
	 */
	public com.marketo.www.mktows.SuccessSyncLead syncLead(
			com.marketo.www.mktows.ParamsSyncLead paramsSyncLead)
			throws java.rmi.RemoteException;

	/**
	 * Create or update one or more leads.
	 */
	public com.marketo.www.mktows.SuccessSyncMultipleLeads syncMultipleLeads(
			com.marketo.www.mktows.ParamsSyncMultipleLeads paramsSyncMultipleLeads)
			throws java.rmi.RemoteException;

	/**
	 * Update, Insert, or Upsert custom object records
	 */
	public com.marketo.www.mktows.SuccessSyncCustomObjects syncCustomObjects(
			com.marketo.www.mktows.ParamsSyncCustomObjects paramsSyncCustomObjects)
			throws java.rmi.RemoteException;

	/**
	 * Delete custom object records
	 */
	public com.marketo.www.mktows.SuccessDeleteCustomObjects deleteCustomObjects(
			com.marketo.www.mktows.ParamsDeleteCustomObjects paramsDeleteCustomObjects)
			throws java.rmi.RemoteException;

	/**
	 * Get custom object records
	 */
	public com.marketo.www.mktows.SuccessGetCustomObjects getCustomObjects(
			com.marketo.www.mktows.ParamsGetCustomObjects paramsGetCustomObjects)
			throws java.rmi.RemoteException;

	/**
	 * Merge Leads
	 */
	public com.marketo.www.mktows.SuccessMergeLeads mergeLeads(
			com.marketo.www.mktows.ParamsMergeLeads paramsMergeLeads)
			throws java.rmi.RemoteException;

	/**
	 * Get Tags
	 */
	public com.marketo.www.mktows.SuccessGetChannels getChannels(
			com.marketo.www.mktows.ParamsGetChannels paramsGetChannels)
			throws java.rmi.RemoteException;

	/**
	 * Get Tags
	 */
	public com.marketo.www.mktows.SuccessGetTags getTags(
			com.marketo.www.mktows.ParamsGetTags paramsGetTags)
			throws java.rmi.RemoteException;
}
