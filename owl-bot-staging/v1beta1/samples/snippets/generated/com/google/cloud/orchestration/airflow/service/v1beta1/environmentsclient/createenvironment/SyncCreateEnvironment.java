/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.orchestration.airflow.service.v1beta1.samples;

// [START service_v1beta1_generated_environmentsclient_createenvironment_sync]
import com.google.cloud.orchestration.airflow.service.v1beta1.CreateEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.Environment;
import com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsClient;

public class SyncCreateEnvironment {

  public static void main(String[] args) throws Exception {
    syncCreateEnvironment();
  }

  public static void syncCreateEnvironment() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
      CreateEnvironmentRequest request =
          CreateEnvironmentRequest.newBuilder()
              .setParent("parent-995424086")
              .setEnvironment(Environment.newBuilder().build())
              .build();
      Environment response = environmentsClient.createEnvironmentAsync(request).get();
    }
  }
}
// [END service_v1beta1_generated_environmentsclient_createenvironment_sync]
