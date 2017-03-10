package org.ligoj.app.resource.plugin.id.ldap;

import java.util.Collection;
import java.util.Map;

import org.ligoj.bootstrap.core.IDescribableBean;
import org.ligoj.app.api.Activity;
import org.ligoj.app.model.ldap.UserLdap;
import lombok.Getter;
import lombok.Setter;

/**
 * Activities computation data model.
 */
@Getter
@Setter
public class ActivitiesComputations {

	/**
	 * User identifiers
	 */
	private Collection<UserLdap> users;

	/**
	 * Unique related nodes
	 */
	private Collection<IDescribableBean<String>> nodes;

	/**
	 * Activities of each user. K = user's login, V = activities, where K = node's identifier, and V is the activity.
	 */
	private Map<String, Map<String, Activity>> activities;

}
