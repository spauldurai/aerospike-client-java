/*
 * Copyright 2012-2018 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.client.cdt;

/**
 * Map return type. Type of data to return when selecting or removing items from the map.
 */
public enum MapReturnType {
	/**
	 * Do not return a result.
	 */
	NONE(0),
	
	/**
	 * Return key index order.
	 * <ul>
	 * <li>0 = first key</li>
	 * <li>N = Nth key</li>
	 * <li>-1 = last key</li>
	 * </ul>
	 */
	INDEX(1),
	
	/**
	 * Return reverse key order.
	 * <ul>
	 * <li>0 = last key</li>
	 * <li>-1 = first key</li>
	 * </ul>
	 */
	REVERSE_INDEX(2),

	/**
	 * Return value order.
	 * <ul>
	 * <li>0 = smallest value</li>
	 * <li>N = Nth smallest value</li>
	 * <li>-1 = largest value</li>
	 * </ul>
	 */
	RANK(3),

	/**
	 * Return reserve value order.
	 * <ul>
	 * <li>0 = largest value</li>
	 * <li>N = Nth largest value</li>
	 * <li>-1 = smallest value</li>
	 * </ul>
	 */
	REVERSE_RANK(4),

	/**
	 * Return count of items selected.
	 */
	COUNT(5),

	/**
	 * Return key for single key read and key list for range read.
	 */
	KEY(6),

	/**
	 * Return value for single key read and value list for range read.
	 */
	VALUE(7),
	
	/**
	 * Return key/value items. The possible return types are:
	 * <ul>
	 * <li>HashMap : Returned for unordered maps</li>
	 * <li>TreeMap : Returned for key ordered maps</li>
	 * <li>List&lt;Entry&gt; : Returned for range results where range order needs to be preserved.</li>
	 * </ul>
	 */
	KEY_VALUE(8);

	protected final int type;
	
	private MapReturnType(int type) {
		this.type = type;
	}
}
