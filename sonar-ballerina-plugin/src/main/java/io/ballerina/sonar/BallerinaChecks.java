/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.ballerina.sonar;

import java.util.ArrayList;
import java.util.List;

public class BallerinaChecks {

    // List for default checks
    static final List<String> DEFAULT_CHECKS = new ArrayList<>();

    // Populating default checks
    static {
        // NOTE: Rule numbers S001 - S106 is not valid
        DEFAULT_CHECKS.add("B1");
        DEFAULT_CHECKS.add("B2");
    }
}
