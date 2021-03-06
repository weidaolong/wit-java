/*
 * Copyright (C) 2018 Clivern <http://clivern.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.clivern.wit;

import com.clivern.wit.Wit;
import com.clivern.wit.util.Config;
import junit.framework.TestCase;
import java.io.IOException;

/**
 * Wit Class Test Cases
 *
 * @since 1.0.0
 */
public class WitTest extends TestCase {

    public void testGetName() throws IOException
    {
        Config config = new Config();
        config.loadPropertiesFile("src/test/java/resources/config.properties");
        config.configLogger();
        assertEquals(new Wit(config).getName(), "Wit-Java ~ v1.0.0");
    }
}