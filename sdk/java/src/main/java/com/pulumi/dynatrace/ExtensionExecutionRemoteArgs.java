// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ExtensionExecutionRemoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionExecutionRemoteArgs Empty = new ExtensionExecutionRemoteArgs();

    /**
     * Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     * 
     */
    @Import(name="performanceProfile", required=true)
    private Output<String> performanceProfile;

    /**
     * @return Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
     * 
     */
    public Output<String> performanceProfile() {
        return this.performanceProfile;
    }

    /**
     * The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private ExtensionExecutionRemoteArgs() {}

    private ExtensionExecutionRemoteArgs(ExtensionExecutionRemoteArgs $) {
        this.performanceProfile = $.performanceProfile;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionExecutionRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionExecutionRemoteArgs $;

        public Builder() {
            $ = new ExtensionExecutionRemoteArgs();
        }

        public Builder(ExtensionExecutionRemoteArgs defaults) {
            $ = new ExtensionExecutionRemoteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param performanceProfile Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(Output<String> performanceProfile) {
            $.performanceProfile = performanceProfile;
            return this;
        }

        /**
         * @param performanceProfile Select performance profile for Extension Execution Controller [Documentation](https://www.dynatrace.com/support/help/shortlink/extensions-concepts#resource-consumption)
         * 
         * @return builder
         * 
         */
        public Builder performanceProfile(String performanceProfile) {
            return performanceProfile(Output.of(performanceProfile));
        }

        /**
         * @param scope The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of this setting (ENVIRONMENT*ACTIVE*GATE)
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public ExtensionExecutionRemoteArgs build() {
            $.performanceProfile = Objects.requireNonNull($.performanceProfile, "expected parameter 'performanceProfile' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
