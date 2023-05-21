// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkHighNetworkDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkNetworkErrorsDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionArgs;
import com.pulumi.dynatrace.inputs.HostAnomaliesV2NetworkNetworkTcpProblemsDetectionArgs;
import java.util.Objects;


public final class HostAnomaliesV2NetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostAnomaliesV2NetworkArgs Empty = new HostAnomaliesV2NetworkArgs();

    /**
     * no documentation available
     * 
     */
    @Import(name="highNetworkDetection", required=true)
    private Output<HostAnomaliesV2NetworkHighNetworkDetectionArgs> highNetworkDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2NetworkHighNetworkDetectionArgs> highNetworkDetection() {
        return this.highNetworkDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="networkDroppedPacketsDetection", required=true)
    private Output<HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionArgs> networkDroppedPacketsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionArgs> networkDroppedPacketsDetection() {
        return this.networkDroppedPacketsDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="networkErrorsDetection", required=true)
    private Output<HostAnomaliesV2NetworkNetworkErrorsDetectionArgs> networkErrorsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2NetworkNetworkErrorsDetectionArgs> networkErrorsDetection() {
        return this.networkErrorsDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="networkHighRetransmissionDetection", required=true)
    private Output<HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionArgs> networkHighRetransmissionDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionArgs> networkHighRetransmissionDetection() {
        return this.networkHighRetransmissionDetection;
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="networkTcpProblemsDetection", required=true)
    private Output<HostAnomaliesV2NetworkNetworkTcpProblemsDetectionArgs> networkTcpProblemsDetection;

    /**
     * @return no documentation available
     * 
     */
    public Output<HostAnomaliesV2NetworkNetworkTcpProblemsDetectionArgs> networkTcpProblemsDetection() {
        return this.networkTcpProblemsDetection;
    }

    private HostAnomaliesV2NetworkArgs() {}

    private HostAnomaliesV2NetworkArgs(HostAnomaliesV2NetworkArgs $) {
        this.highNetworkDetection = $.highNetworkDetection;
        this.networkDroppedPacketsDetection = $.networkDroppedPacketsDetection;
        this.networkErrorsDetection = $.networkErrorsDetection;
        this.networkHighRetransmissionDetection = $.networkHighRetransmissionDetection;
        this.networkTcpProblemsDetection = $.networkTcpProblemsDetection;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostAnomaliesV2NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostAnomaliesV2NetworkArgs $;

        public Builder() {
            $ = new HostAnomaliesV2NetworkArgs();
        }

        public Builder(HostAnomaliesV2NetworkArgs defaults) {
            $ = new HostAnomaliesV2NetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param highNetworkDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highNetworkDetection(Output<HostAnomaliesV2NetworkHighNetworkDetectionArgs> highNetworkDetection) {
            $.highNetworkDetection = highNetworkDetection;
            return this;
        }

        /**
         * @param highNetworkDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder highNetworkDetection(HostAnomaliesV2NetworkHighNetworkDetectionArgs highNetworkDetection) {
            return highNetworkDetection(Output.of(highNetworkDetection));
        }

        /**
         * @param networkDroppedPacketsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkDroppedPacketsDetection(Output<HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionArgs> networkDroppedPacketsDetection) {
            $.networkDroppedPacketsDetection = networkDroppedPacketsDetection;
            return this;
        }

        /**
         * @param networkDroppedPacketsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkDroppedPacketsDetection(HostAnomaliesV2NetworkNetworkDroppedPacketsDetectionArgs networkDroppedPacketsDetection) {
            return networkDroppedPacketsDetection(Output.of(networkDroppedPacketsDetection));
        }

        /**
         * @param networkErrorsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkErrorsDetection(Output<HostAnomaliesV2NetworkNetworkErrorsDetectionArgs> networkErrorsDetection) {
            $.networkErrorsDetection = networkErrorsDetection;
            return this;
        }

        /**
         * @param networkErrorsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkErrorsDetection(HostAnomaliesV2NetworkNetworkErrorsDetectionArgs networkErrorsDetection) {
            return networkErrorsDetection(Output.of(networkErrorsDetection));
        }

        /**
         * @param networkHighRetransmissionDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkHighRetransmissionDetection(Output<HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionArgs> networkHighRetransmissionDetection) {
            $.networkHighRetransmissionDetection = networkHighRetransmissionDetection;
            return this;
        }

        /**
         * @param networkHighRetransmissionDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkHighRetransmissionDetection(HostAnomaliesV2NetworkNetworkHighRetransmissionDetectionArgs networkHighRetransmissionDetection) {
            return networkHighRetransmissionDetection(Output.of(networkHighRetransmissionDetection));
        }

        /**
         * @param networkTcpProblemsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkTcpProblemsDetection(Output<HostAnomaliesV2NetworkNetworkTcpProblemsDetectionArgs> networkTcpProblemsDetection) {
            $.networkTcpProblemsDetection = networkTcpProblemsDetection;
            return this;
        }

        /**
         * @param networkTcpProblemsDetection no documentation available
         * 
         * @return builder
         * 
         */
        public Builder networkTcpProblemsDetection(HostAnomaliesV2NetworkNetworkTcpProblemsDetectionArgs networkTcpProblemsDetection) {
            return networkTcpProblemsDetection(Output.of(networkTcpProblemsDetection));
        }

        public HostAnomaliesV2NetworkArgs build() {
            $.highNetworkDetection = Objects.requireNonNull($.highNetworkDetection, "expected parameter 'highNetworkDetection' to be non-null");
            $.networkDroppedPacketsDetection = Objects.requireNonNull($.networkDroppedPacketsDetection, "expected parameter 'networkDroppedPacketsDetection' to be non-null");
            $.networkErrorsDetection = Objects.requireNonNull($.networkErrorsDetection, "expected parameter 'networkErrorsDetection' to be non-null");
            $.networkHighRetransmissionDetection = Objects.requireNonNull($.networkHighRetransmissionDetection, "expected parameter 'networkHighRetransmissionDetection' to be non-null");
            $.networkTcpProblemsDetection = Objects.requireNonNull($.networkTcpProblemsDetection, "expected parameter 'networkTcpProblemsDetection' to be non-null");
            return $;
        }
    }

}