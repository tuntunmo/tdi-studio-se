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
		if (latestUpdatedAt != null) {
			selector.setLatestUpdatedAt(parseDate("yyyy-MM-dd HH:mm:ss",
					latestUpdatedAt));
		}
		selector.setOldestUpdatedAt(parseDate("yyyy-MM-dd HH:mm:ss",
				oldestUpdatedAt));
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
