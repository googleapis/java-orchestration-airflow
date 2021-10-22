/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= EnvironmentsClient =======================
 *
 * <p>Service Description: Managed Apache Airflow Environments.
 *
 * <p>Sample for EnvironmentsClient:
 *
 * <pre>{@code
 * try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
 *   String name = "name3373707";
 *   Environment response = environmentsClient.getEnvironment(name);
 * }
 * }</pre>
 *
 * <p>======================= ImageVersionsClient =======================
 *
 * <p>Service Description: Readonly service to query available ImageVersions.
 *
 * <p>Sample for ImageVersionsClient:
 *
 * <pre>{@code
 * try (ImageVersionsClient imageVersionsClient = ImageVersionsClient.create()) {
 *   String parent = "parent-995424086";
 *   for (ImageVersion element : imageVersionsClient.listImageVersions(parent).iterateAll()) {
 *     // doThingsWith(element);
 *   }
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.orchestration.airflow.service.v1;

import javax.annotation.Generated;
