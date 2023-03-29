// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/operations.proto

package com.google.cloud.orchestration.airflow.service.v1;

public final class OperationsProto {
  private OperationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/cloud/orchestration/airflow/ser" +
      "vice/v1/operations.proto\022-google.cloud.o" +
      "rchestration.airflow.service.v1\032\037google/" +
      "protobuf/timestamp.proto\"\255\004\n\021OperationMe" +
      "tadata\022U\n\005state\030\001 \001(\0162F.google.cloud.orc" +
      "hestration.airflow.service.v1.OperationM" +
      "etadata.State\022]\n\016operation_type\030\002 \001(\0162E." +
      "google.cloud.orchestration.airflow.servi" +
      "ce.v1.OperationMetadata.Type\022\020\n\010resource" +
      "\030\003 \001(\t\022\025\n\rresource_uuid\030\004 \001(\t\022/\n\013create_" +
      "time\030\005 \001(\0132\032.google.protobuf.Timestamp\022," +
      "\n\010end_time\030\006 \001(\0132\032.google.protobuf.Times" +
      "tamp\"g\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\013\n\007" +
      "PENDING\020\001\022\013\n\007RUNNING\020\002\022\r\n\tSUCCEEDED\020\003\022\016\n" +
      "\nSUCCESSFUL\020\003\022\n\n\006FAILED\020\004\032\002\020\001\"q\n\004Type\022\024\n" +
      "\020TYPE_UNSPECIFIED\020\000\022\n\n\006CREATE\020\001\022\n\n\006DELET" +
      "E\020\002\022\n\n\006UPDATE\020\003\022\t\n\005CHECK\020\004\022\021\n\rSAVE_SNAPS" +
      "HOT\020\005\022\021\n\rLOAD_SNAPSHOT\020\006B\223\001\n1com.google." +
      "cloud.orchestration.airflow.service.v1B\017" +
      "OperationsProtoP\001ZKcloud.google.com/go/o" +
      "rchestration/airflow/service/apiv1/servi" +
      "cepb;servicepbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orchestration_airflow_service_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "State", "OperationType", "Resource", "ResourceUuid", "CreateTime", "EndTime", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
