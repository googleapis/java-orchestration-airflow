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

// [START service_v1beta1_generated_environmentsclient_createenvironment_lro_async]
import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.orchestration.airflow.service.v1beta1.CreateEnvironmentRequest;
import com.google.cloud.orchestration.airflow.service.v1beta1.Environment;
import com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentsClient;
import com.google.cloud.orchestration.airflow.service.v1beta1.OperationMetadata;

public class AsyncCreateEnvironmentLRO {

  public static void main(String[] args) throws Exception {
    asyncCreateEnvironmentLRO();
  }

  public static void asyncCreateEnvironmentLRO() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (EnvironmentsClient environmentsClient = EnvironmentsClient.create()) {
      CreateEnvironmentRequest request =
          CreateEnvironmentRequest.newBuilder()
              .setParent("parent-995424086")
              .setEnvironment(Environment.newBuilder().build())
              .build();
      OperationFuture<Environment, OperationMetadata> future =
          environmentsClient.createEnvironmentOperationCallable().futureCall(request);
      // Do something.
      Environment response = future.get();
    }
  }
}
// [END service_v1beta1_generated_environmentsclient_createenvironment_lro_async]
