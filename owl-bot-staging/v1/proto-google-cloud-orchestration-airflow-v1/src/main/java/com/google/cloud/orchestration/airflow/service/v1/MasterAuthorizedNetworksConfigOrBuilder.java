// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1;

public interface MasterAuthorizedNetworksConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether or not master authorized networks feature is enabled.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Up to 50 external networks that could access Kubernetes master through
   * HTTPS.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  java.util.List<com.google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock> 
      getCidrBlocksList();
  /**
   * <pre>
   * Up to 50 external networks that could access Kubernetes master through
   * HTTPS.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock getCidrBlocks(int index);
  /**
   * <pre>
   * Up to 50 external networks that could access Kubernetes master through
   * HTTPS.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  int getCidrBlocksCount();
  /**
   * <pre>
   * Up to 50 external networks that could access Kubernetes master through
   * HTTPS.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  java.util.List<? extends com.google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlockOrBuilder> 
      getCidrBlocksOrBuilderList();
  /**
   * <pre>
   * Up to 50 external networks that could access Kubernetes master through
   * HTTPS.
   * </pre>
   *
   * <code>repeated .google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlock cidr_blocks = 2;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1.MasterAuthorizedNetworksConfig.CidrBlockOrBuilder getCidrBlocksOrBuilder(
      int index);
}