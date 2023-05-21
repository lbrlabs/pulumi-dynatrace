// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MgmzPermissionState extends com.pulumi.resources.ResourceArgs {

    public static final MgmzPermissionState Empty = new MgmzPermissionState();

    /**
     * The UUID of the environment
     * 
     */
    @Import(name="environment")
    private @Nullable Output<String> environment;

    /**
     * @return The UUID of the environment
     * 
     */
    public Optional<Output<String>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The ID of the group the permissions are valid for. You may refer to the id of a resource `dynatrace.UserGroup` here
     * 
     */
    @Import(name="group")
    private @Nullable Output<String> group;

    /**
     * @return The ID of the group the permissions are valid for. You may refer to the id of a resource `dynatrace.UserGroup` here
     * 
     */
    public Optional<Output<String>> group() {
        return Optional.ofNullable(this.group);
    }

    /**
     * The ID of the management zone the permissions are valid for. When referring to resource `dynatrace.ManagementZoneV2` or data source `dynatrace.ManagementZone` you need to refer to the attribute `legacy_id`.
     * 
     */
    @Import(name="managementZone")
    private @Nullable Output<String> managementZone;

    /**
     * @return The ID of the management zone the permissions are valid for. When referring to resource `dynatrace.ManagementZoneV2` or data source `dynatrace.ManagementZone` you need to refer to the attribute `legacy_id`.
     * 
     */
    public Optional<Output<String>> managementZone() {
        return Optional.ofNullable(this.managementZone);
    }

    /**
     * The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    /**
     * @return The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
     * 
     */
    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private MgmzPermissionState() {}

    private MgmzPermissionState(MgmzPermissionState $) {
        this.environment = $.environment;
        this.group = $.group;
        this.managementZone = $.managementZone;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MgmzPermissionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MgmzPermissionState $;

        public Builder() {
            $ = new MgmzPermissionState();
        }

        public Builder(MgmzPermissionState defaults) {
            $ = new MgmzPermissionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param environment The UUID of the environment
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<String> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The UUID of the environment
         * 
         * @return builder
         * 
         */
        public Builder environment(String environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param group The ID of the group the permissions are valid for. You may refer to the id of a resource `dynatrace.UserGroup` here
         * 
         * @return builder
         * 
         */
        public Builder group(@Nullable Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The ID of the group the permissions are valid for. You may refer to the id of a resource `dynatrace.UserGroup` here
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param managementZone The ID of the management zone the permissions are valid for. When referring to resource `dynatrace.ManagementZoneV2` or data source `dynatrace.ManagementZone` you need to refer to the attribute `legacy_id`.
         * 
         * @return builder
         * 
         */
        public Builder managementZone(@Nullable Output<String> managementZone) {
            $.managementZone = managementZone;
            return this;
        }

        /**
         * @param managementZone The ID of the management zone the permissions are valid for. When referring to resource `dynatrace.ManagementZoneV2` or data source `dynatrace.ManagementZone` you need to refer to the attribute `legacy_id`.
         * 
         * @return builder
         * 
         */
        public Builder managementZone(String managementZone) {
            return managementZone(Output.of(managementZone));
        }

        /**
         * @param permissions The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
         * 
         * @return builder
         * 
         */
        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        /**
         * @param permissions The permissions to assign for that management zone. Allowed values are `DEMO_USER`, `LOG_VIEWER`, `MANAGE_SECURITY_PROBLEMS`, `MANAGE_SETTINGS`, `REPLAY_SESSION_DATA`, `REPLAY_SESSION_DATA_WITHOUT_MASKING`, `VIEWER`, `VIEW_SENSITIVE_REQUEST_DATA`
         * 
         * @return builder
         * 
         */
        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public MgmzPermissionState build() {
            return $;
        }
    }

}