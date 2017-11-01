/**
 * Copyright (c) 2017 Contributors to the Eclipse Foundation
 * Copyright 2017 SmartBear Software
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.eclipse.microprofile.openapi.models.media;

import java.util.List;

/**
 * The schema used for an object that holds integer data.
 */
public interface IntegerSchema extends Schema<Integer> {

	/**
	 * Change this IntegerSchema's type property from the default value to the
	 * given string. 
	 *
	 * @param type  the name of a valid type
	 * @return the current IntegerSchema instance
	 */
	IntegerSchema type(String type);

	/**
	 * Change this IntegerSchema's format property from the default value to the
	 * given format. The value may be one of the formats described in the OAS or
	 * a user defined format.
	 *
	 * @param format
	 *            the string specifying the data format
	 * @return the current IntegerSchema instance
	 */
	IntegerSchema format(String format);

	/**
	 * Sets the default property of this IntegerSchema to the given default value.
	 * 
	 * @param defaultValue  a value to use as the default
	 * @return the current IntegerSchema instance
	 */
	IntegerSchema defaultValue(Integer defaultValue);

	/**
	 * Sets the enumerated list of values allowed for objects defined by this schema.
	 *
	 * @param enumeration a list of values allowed
	 * @return the current IntegerSchema instance
	 */
	IntegerSchema enumeration(List<Integer> enumeration);

	/**
	 * Adds an item of the appropriate type to the enumerated list of values
	 * allowed.
	 *
	 * @param enumerationItem  an object to add to the enumerated values
	 * @return the current IntegerSchema instance
	 */
	IntegerSchema addEnumerationItem(Integer enumerationItem);

}