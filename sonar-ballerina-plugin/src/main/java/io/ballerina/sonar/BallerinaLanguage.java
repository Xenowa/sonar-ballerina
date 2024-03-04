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

import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

public class BallerinaLanguage extends AbstractLanguage {

    private final Configuration configuration;

    public BallerinaLanguage(Configuration configuration) {

        super(BallerinaPlugin.BALLERINA_LANGUAGE_KEY, BallerinaPlugin.BALLERINA_LANGUAGE_NAME);
        this.configuration = configuration;
    }

    @Override
    public String[] getFileSuffixes() {

        String[] suffixes = configuration.getStringArray(BallerinaPlugin.BALLERINA_FILE_SUFFIXES_KEY);
        if (suffixes == null || suffixes.length == 0) {
            return BallerinaPlugin.BALLERINA_FILE_SUFFIXES_DEFAULT_VALUE.split(",");
        } else {
            return suffixes;
        }
    }
}
