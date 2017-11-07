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

package org.eclipse.microprofile.openapi.annotations.media;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This object represents a Schema of type array, allowing the items to have a Schema annotation inside of this object.
 *
 */
@Target({ ElementType.FIELD,
        ElementType.METHOD,
        ElementType.PARAMETER,
        ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ArraySchema {
    Schema schema() default @Schema;

    /**
     * sets the maximum number of items in an array.  Ignored if value is Integer.MIN_VALUE.
     * 
     * @return the maximum number of items in this array
     **/
    int maxItems() default Integer.MIN_VALUE;

    /**
     * sets the minimum number of items in an array.  Ignored if value is Integer.MAX_VALUE.
     * 
     * @return the minimum number of items in this array
     **/
    int minItems() default Integer.MAX_VALUE;

    /**
     * determines whether an array of items will be unique
     * 
     * @return whether the items in this array are unique
     **/
    boolean uniqueItems() default false;
}