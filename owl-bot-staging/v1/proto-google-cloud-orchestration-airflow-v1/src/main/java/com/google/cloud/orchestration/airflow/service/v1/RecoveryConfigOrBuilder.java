// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

public interface RecoveryConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.RecoveryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the scheduledSnapshotsConfig field is set.
   */
  boolean hasScheduledSnapshotsConfig();
  /**
   * <pre>
   * Optional. The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The scheduledSnapshotsConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig getScheduledSnapshotsConfig();
  /**
   * <pre>
   * Optional. The configuration for scheduled snapshot creation mechanism.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfig scheduled_snapshots_config = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1.ScheduledSnapshotsConfigOrBuilder getScheduledSnapshotsConfigOrBuilder();
}