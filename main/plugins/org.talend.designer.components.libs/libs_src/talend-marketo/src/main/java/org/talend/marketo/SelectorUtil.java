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
package org.talend.marketo;

import java.text.ParseException;
import java.util.Calendar;

import com.marketo.www.mktows.LastUpdateAtSelector;
import com.marketo.www.mktows.LeadKeyRef;
import com.marketo.www.mktows.LeadKeySelector;
import com.marketo.www.mktows.StaticListSelector;

public class SelectorUtil {

	public static LastUpdateAtSelector getLastUpdateAtSelector(
			String oldestUpdatedAt, String latestUpdatedAt)
			throws ParseException {
		LastUpdateAtSelector selector = new LastUpdateAtSelector();
		if (latestUpdatedAt != null && latestUpdatedAt.length()>0) {
			selector.setLatestUpdatedAt(parseDate("yyyy-MM-dd HH:mm:ss",
					latestUpdatedAt));
		}
		if (oldestUpdatedAt != null && oldestUpdatedAt.length()>0) {
			selector.setOldestUpdatedAt(parseDate("yyyy-MM-dd HH:mm:ss",
					oldestUpdatedAt));
		}
		return selector;
	}

	public static StaticListSelector getStaticListSelectorByName(
			String staticListName) {

		return new StaticListSelector(staticListName, null);

	}

	public static StaticListSelector getStaticListSelectorByID(
			Integer staticListId) {

		return new StaticListSelector(null, staticListId);

	}

	public static LeadKeySelector getLeadKeySelector(String keyType,
			String... value) {

		return new LeadKeySelector(LeadKeyRef.fromString(keyType), value);

	}

	public static Calendar parseDate(String partten, String datatime)
			throws ParseException {
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat(
				partten);
		format.parse(datatime);
		return format.getCalendar();
	}

}
