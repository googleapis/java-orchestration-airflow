/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/operations.proto

package com.google.cloud.orchestration.airflow.service.v1;

public final class OperationsProto {
  private OperationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/orchestration/airflow/ser"
          + "vice/v1/operations.proto\022-google.cloud.o"
          + "rchestration.airflow.service.v1\032\037google/"
          + "protobuf/timestamp.proto\032\034google/api/ann"
          + "otations.proto\"\207\004\n\021OperationMetadata\022U\n\005"
          + "state\030\001 \001(\0162F.google.cloud.orchestration"
          + ".airflow.service.v1.OperationMetadata.St"
          + "ate\022]\n\016operation_type\030\002 \001(\0162E.google.clo"
          + "ud.orchestration.airflow.service.v1.Oper"
          + "ationMetadata.Type\022\020\n\010resource\030\003 \001(\t\022\025\n\r"
          + "resource_uuid\030\004 \001(\t\022/\n\013create_time\030\005 \001(\013"
          + "2\032.google.protobuf.Timestamp\022,\n\010end_time"
          + "\030\006 \001(\0132\032.google.protobuf.Timestamp\"g\n\005St"
          + "ate\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007PENDING\020\001\022"
          + "\013\n\007RUNNING\020\002\022\r\n\tSUCCEEDED\020\003\022\016\n\nSUCCESSFU"
          + "L\020\003\022\n\n\006FAILED\020\004\032\002\020\001\"K\n\004Type\022\024\n\020TYPE_UNSP"
          + "ECIFIED\020\000\022\n\n\006CREATE\020\001\022\n\n\006DELETE\020\002\022\n\n\006UPD"
          + "ATE\020\003\022\t\n\005CHECK\020\004B\234\001\n1com.google.cloud.or"
          + "chestration.airflow.service.v1B\017Operatio"
          + "nsProtoP\001ZTgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/orchestration/airflow/ser"
          + "vice/v1;serviceb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "OperationType", "Resource", "ResourceUuid", "CreateTime", "EndTime",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
