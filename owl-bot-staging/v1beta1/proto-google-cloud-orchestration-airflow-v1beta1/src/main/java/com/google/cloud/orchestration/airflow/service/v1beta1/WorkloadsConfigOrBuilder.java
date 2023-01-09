// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface WorkloadsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Resources used by Airflow schedulers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.SchedulerResource scheduler = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the scheduler field is set.
   */
  boolean hasScheduler();
  /**
   * <pre>
   * Optional. Resources used by Airflow schedulers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.SchedulerResource scheduler = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The scheduler.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.SchedulerResource getScheduler();
  /**
   * <pre>
   * Optional. Resources used by Airflow schedulers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.SchedulerResource scheduler = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.SchedulerResourceOrBuilder getSchedulerOrBuilder();

  /**
   * <pre>
   * Optional. Resources used by Airflow web server.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WebServerResource web_server = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the webServer field is set.
   */
  boolean hasWebServer();
  /**
   * <pre>
   * Optional. Resources used by Airflow web server.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WebServerResource web_server = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The webServer.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WebServerResource getWebServer();
  /**
   * <pre>
   * Optional. Resources used by Airflow web server.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WebServerResource web_server = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WebServerResourceOrBuilder getWebServerOrBuilder();

  /**
   * <pre>
   * Optional. Resources used by Airflow workers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WorkerResource worker = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the worker field is set.
   */
  boolean hasWorker();
  /**
   * <pre>
   * Optional. Resources used by Airflow workers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WorkerResource worker = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The worker.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WorkerResource getWorker();
  /**
   * <pre>
   * Optional. Resources used by Airflow workers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WorkerResource worker = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.WorkerResourceOrBuilder getWorkerOrBuilder();

  /**
   * <pre>
   * Optional. Resources used by Airflow triggerers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.TriggererResource triggerer = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the triggerer field is set.
   */
  boolean hasTriggerer();
  /**
   * <pre>
   * Optional. Resources used by Airflow triggerers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.TriggererResource triggerer = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The triggerer.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.TriggererResource getTriggerer();
  /**
   * <pre>
   * Optional. Resources used by Airflow triggerers.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.TriggererResource triggerer = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.WorkloadsConfig.TriggererResourceOrBuilder getTriggererOrBuilder();
}
