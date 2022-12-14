// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesFailureRatesArgs;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesLoadArgs;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesLoadDropsArgs;
import com.pulumi.dynatrace.inputs.ServiceAnomaliesResponseTimesArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAnomaliesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAnomaliesArgs Empty = new ServiceAnomaliesArgs();

    /**
     * Configuration of failure rate increase detection. Detecting failure rate increases will be disabled if this block is omitted.
     * 
     */
    @Import(name="failureRates")
    private @Nullable Output<ServiceAnomaliesFailureRatesArgs> failureRates;

    /**
     * @return Configuration of failure rate increase detection. Detecting failure rate increases will be disabled if this block is omitted.
     * 
     */
    public Optional<Output<ServiceAnomaliesFailureRatesArgs>> failureRates() {
        return Optional.ofNullable(this.failureRates);
    }

    /**
     * The configuration of load spikes detection. Detecting load spikes will be disabled if this block is omitted.
     * 
     */
    @Import(name="load")
    private @Nullable Output<ServiceAnomaliesLoadArgs> load;

    /**
     * @return The configuration of load spikes detection. Detecting load spikes will be disabled if this block is omitted.
     * 
     */
    public Optional<Output<ServiceAnomaliesLoadArgs>> load() {
        return Optional.ofNullable(this.load);
    }

    /**
     * The configuration of load drops detection. Detecting load drops will be disabled if this block is omitted.
     * 
     */
    @Import(name="loadDrops")
    private @Nullable Output<ServiceAnomaliesLoadDropsArgs> loadDrops;

    /**
     * @return The configuration of load drops detection. Detecting load drops will be disabled if this block is omitted.
     * 
     */
    public Optional<Output<ServiceAnomaliesLoadDropsArgs>> loadDrops() {
        return Optional.ofNullable(this.loadDrops);
    }

    /**
     * Configuration of response time degradation detection. Detecting response time degradation will be disabled if this block is omitted.
     * 
     */
    @Import(name="responseTimes")
    private @Nullable Output<ServiceAnomaliesResponseTimesArgs> responseTimes;

    /**
     * @return Configuration of response time degradation detection. Detecting response time degradation will be disabled if this block is omitted.
     * 
     */
    public Optional<Output<ServiceAnomaliesResponseTimesArgs>> responseTimes() {
        return Optional.ofNullable(this.responseTimes);
    }

    private ServiceAnomaliesArgs() {}

    private ServiceAnomaliesArgs(ServiceAnomaliesArgs $) {
        this.failureRates = $.failureRates;
        this.load = $.load;
        this.loadDrops = $.loadDrops;
        this.responseTimes = $.responseTimes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceAnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceAnomaliesArgs $;

        public Builder() {
            $ = new ServiceAnomaliesArgs();
        }

        public Builder(ServiceAnomaliesArgs defaults) {
            $ = new ServiceAnomaliesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureRates Configuration of failure rate increase detection. Detecting failure rate increases will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder failureRates(@Nullable Output<ServiceAnomaliesFailureRatesArgs> failureRates) {
            $.failureRates = failureRates;
            return this;
        }

        /**
         * @param failureRates Configuration of failure rate increase detection. Detecting failure rate increases will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder failureRates(ServiceAnomaliesFailureRatesArgs failureRates) {
            return failureRates(Output.of(failureRates));
        }

        /**
         * @param load The configuration of load spikes detection. Detecting load spikes will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder load(@Nullable Output<ServiceAnomaliesLoadArgs> load) {
            $.load = load;
            return this;
        }

        /**
         * @param load The configuration of load spikes detection. Detecting load spikes will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder load(ServiceAnomaliesLoadArgs load) {
            return load(Output.of(load));
        }

        /**
         * @param loadDrops The configuration of load drops detection. Detecting load drops will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder loadDrops(@Nullable Output<ServiceAnomaliesLoadDropsArgs> loadDrops) {
            $.loadDrops = loadDrops;
            return this;
        }

        /**
         * @param loadDrops The configuration of load drops detection. Detecting load drops will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder loadDrops(ServiceAnomaliesLoadDropsArgs loadDrops) {
            return loadDrops(Output.of(loadDrops));
        }

        /**
         * @param responseTimes Configuration of response time degradation detection. Detecting response time degradation will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder responseTimes(@Nullable Output<ServiceAnomaliesResponseTimesArgs> responseTimes) {
            $.responseTimes = responseTimes;
            return this;
        }

        /**
         * @param responseTimes Configuration of response time degradation detection. Detecting response time degradation will be disabled if this block is omitted.
         * 
         * @return builder
         * 
         */
        public Builder responseTimes(ServiceAnomaliesResponseTimesArgs responseTimes) {
            return responseTimes(Output.of(responseTimes));
        }

        public ServiceAnomaliesArgs build() {
            return $;
        }
    }

}
