// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesV2FailureRateArgs;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesV2LoadDropsArgs;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesV2LoadSpikesArgs;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesV2ResponseTimeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAnomaliesV2State extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesV2State Empty = new ServiceAnomaliesV2State();

    /**
     * Failure rate
     * 
     */
    @Import(name="failureRate")
    private @Nullable Output<ServiceAnomaliesV2FailureRateArgs> failureRate;

    /**
     * @return Failure rate
     * 
     */
    public Optional<Output<ServiceAnomaliesV2FailureRateArgs>> failureRate() {
        return Optional.ofNullable(this.failureRate);
    }

    /**
     * Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time:
     * 
     */
    @Import(name="loadDrops")
    private @Nullable Output<ServiceAnomaliesV2LoadDropsArgs> loadDrops;

    /**
     * @return Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time:
     * 
     */
    public Optional<Output<ServiceAnomaliesV2LoadDropsArgs>> loadDrops() {
        return Optional.ofNullable(this.loadDrops);
    }

    /**
     * Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time:
     * 
     */
    @Import(name="loadSpikes")
    private @Nullable Output<ServiceAnomaliesV2LoadSpikesArgs> loadSpikes;

    /**
     * @return Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time:
     * 
     */
    public Optional<Output<ServiceAnomaliesV2LoadSpikesArgs>> loadSpikes() {
        return Optional.ofNullable(this.loadSpikes);
    }

    /**
     * Response time
     * 
     */
    @Import(name="responseTime")
    private @Nullable Output<ServiceAnomaliesV2ResponseTimeArgs> responseTime;

    /**
     * @return Response time
     * 
     */
    public Optional<Output<ServiceAnomaliesV2ResponseTimeArgs>> responseTime() {
        return Optional.ofNullable(this.responseTime);
    }

    /**
     * The scope for the service anomaly detection
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    /**
     * @return The scope for the service anomaly detection
     * 
     */
    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private ServiceAnomaliesV2State() {}

    private ServiceAnomaliesV2State(ServiceAnomaliesV2State $) {
        this.failureRate = $.failureRate;
        this.loadDrops = $.loadDrops;
        this.loadSpikes = $.loadSpikes;
        this.responseTime = $.responseTime;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesV2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesV2State $;

        public Builder() {
            $ = new ServiceAnomaliesV2State();
        }

        public Builder(ServiceAnomaliesV2State defaults) {
            $ = new ServiceAnomaliesV2State(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureRate Failure rate
         * 
         * @return builder
         * 
         */
        public Builder failureRate(@Nullable Output<ServiceAnomaliesV2FailureRateArgs> failureRate) {
            $.failureRate = failureRate;
            return this;
        }

        /**
         * @param failureRate Failure rate
         * 
         * @return builder
         * 
         */
        public Builder failureRate(ServiceAnomaliesV2FailureRateArgs failureRate) {
            return failureRate(Output.of(failureRate));
        }

        /**
         * @param loadDrops Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time:
         * 
         * @return builder
         * 
         */
        public Builder loadDrops(@Nullable Output<ServiceAnomaliesV2LoadDropsArgs> loadDrops) {
            $.loadDrops = loadDrops;
            return this;
        }

        /**
         * @param loadDrops Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time:
         * 
         * @return builder
         * 
         */
        public Builder loadDrops(ServiceAnomaliesV2LoadDropsArgs loadDrops) {
            return loadDrops(Output.of(loadDrops));
        }

        /**
         * @param loadSpikes Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time:
         * 
         * @return builder
         * 
         */
        public Builder loadSpikes(@Nullable Output<ServiceAnomaliesV2LoadSpikesArgs> loadSpikes) {
            $.loadSpikes = loadSpikes;
            return this;
        }

        /**
         * @param loadSpikes Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time:
         * 
         * @return builder
         * 
         */
        public Builder loadSpikes(ServiceAnomaliesV2LoadSpikesArgs loadSpikes) {
            return loadSpikes(Output.of(loadSpikes));
        }

        /**
         * @param responseTime Response time
         * 
         * @return builder
         * 
         */
        public Builder responseTime(@Nullable Output<ServiceAnomaliesV2ResponseTimeArgs> responseTime) {
            $.responseTime = responseTime;
            return this;
        }

        /**
         * @param responseTime Response time
         * 
         * @return builder
         * 
         */
        public Builder responseTime(ServiceAnomaliesV2ResponseTimeArgs responseTime) {
            return responseTime(Output.of(responseTime));
        }

        /**
         * @param scope The scope for the service anomaly detection
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope for the service anomaly detection
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public ServiceAnomaliesV2State build() {
            return $;
        }
    }

}
