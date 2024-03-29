// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2DatabaseConnectionsArgs;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2FailureRateArgs;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2LoadDropsArgs;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2LoadSpikesArgs;
import com.pulumi.dynatrace.inputs.DatabaseAnomaliesV2ResponseTimeArgs;
import java.lang.String;
import java.util.Objects;


public final class DatabaseAnomaliesV2Args extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseAnomaliesV2Args Empty = new DatabaseAnomaliesV2Args();

    /**
     * Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
     * 
     */
    @Import(name="databaseConnections", required=true)
    private Output<DatabaseAnomaliesV2DatabaseConnectionsArgs> databaseConnections;

    /**
     * @return Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
     * 
     */
    public Output<DatabaseAnomaliesV2DatabaseConnectionsArgs> databaseConnections() {
        return this.databaseConnections;
    }

    /**
     * Failure rate
     * 
     */
    @Import(name="failureRate", required=true)
    private Output<DatabaseAnomaliesV2FailureRateArgs> failureRate;

    /**
     * @return Failure rate
     * 
     */
    public Output<DatabaseAnomaliesV2FailureRateArgs> failureRate() {
        return this.failureRate;
    }

    /**
     * Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
     * 
     */
    @Import(name="loadDrops", required=true)
    private Output<DatabaseAnomaliesV2LoadDropsArgs> loadDrops;

    /**
     * @return Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
     * 
     */
    public Output<DatabaseAnomaliesV2LoadDropsArgs> loadDrops() {
        return this.loadDrops;
    }

    /**
     * Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
     * 
     */
    @Import(name="loadSpikes", required=true)
    private Output<DatabaseAnomaliesV2LoadSpikesArgs> loadSpikes;

    /**
     * @return Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
     * 
     */
    public Output<DatabaseAnomaliesV2LoadSpikesArgs> loadSpikes() {
        return this.loadSpikes;
    }

    /**
     * Response time
     * 
     */
    @Import(name="responseTime", required=true)
    private Output<DatabaseAnomaliesV2ResponseTimeArgs> responseTime;

    /**
     * @return Response time
     * 
     */
    public Output<DatabaseAnomaliesV2ResponseTimeArgs> responseTime() {
        return this.responseTime;
    }

    /**
     * The scope for the database anomaly detection
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope for the database anomaly detection
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private DatabaseAnomaliesV2Args() {}

    private DatabaseAnomaliesV2Args(DatabaseAnomaliesV2Args $) {
        this.databaseConnections = $.databaseConnections;
        this.failureRate = $.failureRate;
        this.loadDrops = $.loadDrops;
        this.loadSpikes = $.loadSpikes;
        this.responseTime = $.responseTime;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseAnomaliesV2Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseAnomaliesV2Args $;

        public Builder() {
            $ = new DatabaseAnomaliesV2Args();
        }

        public Builder(DatabaseAnomaliesV2Args defaults) {
            $ = new DatabaseAnomaliesV2Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param databaseConnections Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
         * 
         * @return builder
         * 
         */
        public Builder databaseConnections(Output<DatabaseAnomaliesV2DatabaseConnectionsArgs> databaseConnections) {
            $.databaseConnections = databaseConnections;
            return this;
        }

        /**
         * @param databaseConnections Alert if the number of failed database connects within the specified time exceeds the specified absolute threshold:
         * 
         * @return builder
         * 
         */
        public Builder databaseConnections(DatabaseAnomaliesV2DatabaseConnectionsArgs databaseConnections) {
            return databaseConnections(Output.of(databaseConnections));
        }

        /**
         * @param failureRate Failure rate
         * 
         * @return builder
         * 
         */
        public Builder failureRate(Output<DatabaseAnomaliesV2FailureRateArgs> failureRate) {
            $.failureRate = failureRate;
            return this;
        }

        /**
         * @param failureRate Failure rate
         * 
         * @return builder
         * 
         */
        public Builder failureRate(DatabaseAnomaliesV2FailureRateArgs failureRate) {
            return failureRate(Output.of(failureRate));
        }

        /**
         * @param loadDrops Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
         * 
         * @return builder
         * 
         */
        public Builder loadDrops(Output<DatabaseAnomaliesV2LoadDropsArgs> loadDrops) {
            $.loadDrops = loadDrops;
            return this;
        }

        /**
         * @param loadDrops Alert if the observed load is lower than the expected load by a specified margin for a specified amount of time.
         * 
         * @return builder
         * 
         */
        public Builder loadDrops(DatabaseAnomaliesV2LoadDropsArgs loadDrops) {
            return loadDrops(Output.of(loadDrops));
        }

        /**
         * @param loadSpikes Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
         * 
         * @return builder
         * 
         */
        public Builder loadSpikes(Output<DatabaseAnomaliesV2LoadSpikesArgs> loadSpikes) {
            $.loadSpikes = loadSpikes;
            return this;
        }

        /**
         * @param loadSpikes Alert if the observed load exceeds the expected load by a specified margin for a specified amount of time.
         * 
         * @return builder
         * 
         */
        public Builder loadSpikes(DatabaseAnomaliesV2LoadSpikesArgs loadSpikes) {
            return loadSpikes(Output.of(loadSpikes));
        }

        /**
         * @param responseTime Response time
         * 
         * @return builder
         * 
         */
        public Builder responseTime(Output<DatabaseAnomaliesV2ResponseTimeArgs> responseTime) {
            $.responseTime = responseTime;
            return this;
        }

        /**
         * @param responseTime Response time
         * 
         * @return builder
         * 
         */
        public Builder responseTime(DatabaseAnomaliesV2ResponseTimeArgs responseTime) {
            return responseTime(Output.of(responseTime));
        }

        /**
         * @param scope The scope for the database anomaly detection
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope for the database anomaly detection
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public DatabaseAnomaliesV2Args build() {
            $.databaseConnections = Objects.requireNonNull($.databaseConnections, "expected parameter 'databaseConnections' to be non-null");
            $.failureRate = Objects.requireNonNull($.failureRate, "expected parameter 'failureRate' to be non-null");
            $.loadDrops = Objects.requireNonNull($.loadDrops, "expected parameter 'loadDrops' to be non-null");
            $.loadSpikes = Objects.requireNonNull($.loadSpikes, "expected parameter 'loadSpikes' to be non-null");
            $.responseTime = Objects.requireNonNull($.responseTime, "expected parameter 'responseTime' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
