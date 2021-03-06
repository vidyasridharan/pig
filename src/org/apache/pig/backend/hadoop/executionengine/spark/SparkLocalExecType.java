/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.pig.backend.hadoop.executionengine.spark;

import java.util.Properties;

/**
 * SparkLocalExecType is the ExecType for local mode in Spark.
 */
public class SparkLocalExecType extends SparkExecType {

    private static final long serialVersionUID = 1L;
    private static final String mode = "SPARK_LOCAL";

    @Override
    public boolean accepts(Properties properties) {
        String execTypeSpecified = properties.getProperty("exectype", "")
                .toUpperCase();
        if (execTypeSpecified.equals(mode))
            return true;
        return false;
    }

    @Override
    public boolean isLocal() {
        return true;
    }

    @Override
    public String name() {
        return "SPARK_LOCAL";
    }
}
