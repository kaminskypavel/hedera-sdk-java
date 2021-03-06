package com.hedera.sdk.common;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Description and UUID for a key
 */

public class HederaKeyUUIDDescription implements Serializable {
	private static final long serialVersionUID = 1L;
	final Logger logger = LoggerFactory.getLogger(HederaKeyUUIDDescription.class);

	/**
	 * Description of the key
	 */
	public String description = "";
	/**
	 * UUID for the key
	 */
	public String uuid = "";
	
	/**
	 * Default constructor
	 */
	public HederaKeyUUIDDescription () {
		
	}
	/**
	 * Constructs from a uuid and description
	 * @param uuid the UUID
	 * @param description the description
	 */
	public HederaKeyUUIDDescription (String uuid, String description) {
		logger.trace("Start - HederaKeyUUIDDescription uuid {}, description {}", uuid, description);
		this.description = description;
		this.uuid = uuid;
		logger.trace("End - HederaKeyUUIDDescription");
	}
}
