// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransactionStartFiltersArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransactionStartFiltersArgs Empty = new TransactionStartFiltersArgs();

    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    @Import(name="cicsTerminalTransactionIds")
    private @Nullable Output<List<String>> cicsTerminalTransactionIds;

    /**
     * @return You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    public Optional<Output<List<String>>> cicsTerminalTransactionIds() {
        return Optional.ofNullable(this.cicsTerminalTransactionIds);
    }

    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    @Import(name="cicsTransactionIds")
    private @Nullable Output<List<String>> cicsTransactionIds;

    /**
     * @return You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    public Optional<Output<List<String>>> cicsTransactionIds() {
        return Optional.ofNullable(this.cicsTransactionIds);
    }

    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    @Import(name="imsTerminalTransactionIds")
    private @Nullable Output<List<String>> imsTerminalTransactionIds;

    /**
     * @return You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    public Optional<Output<List<String>>> imsTerminalTransactionIds() {
        return Optional.ofNullable(this.imsTerminalTransactionIds);
    }

    /**
     * You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    @Import(name="imsTransactionIds")
    private @Nullable Output<List<String>> imsTransactionIds;

    /**
     * @return You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
     * 
     */
    public Optional<Output<List<String>>> imsTransactionIds() {
        return Optional.ofNullable(this.imsTransactionIds);
    }

    private TransactionStartFiltersArgs() {}

    private TransactionStartFiltersArgs(TransactionStartFiltersArgs $) {
        this.cicsTerminalTransactionIds = $.cicsTerminalTransactionIds;
        this.cicsTransactionIds = $.cicsTransactionIds;
        this.imsTerminalTransactionIds = $.imsTerminalTransactionIds;
        this.imsTransactionIds = $.imsTransactionIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransactionStartFiltersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransactionStartFiltersArgs $;

        public Builder() {
            $ = new TransactionStartFiltersArgs();
        }

        public Builder(TransactionStartFiltersArgs defaults) {
            $ = new TransactionStartFiltersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cicsTerminalTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder cicsTerminalTransactionIds(@Nullable Output<List<String>> cicsTerminalTransactionIds) {
            $.cicsTerminalTransactionIds = cicsTerminalTransactionIds;
            return this;
        }

        /**
         * @param cicsTerminalTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder cicsTerminalTransactionIds(List<String> cicsTerminalTransactionIds) {
            return cicsTerminalTransactionIds(Output.of(cicsTerminalTransactionIds));
        }

        /**
         * @param cicsTerminalTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder cicsTerminalTransactionIds(String... cicsTerminalTransactionIds) {
            return cicsTerminalTransactionIds(List.of(cicsTerminalTransactionIds));
        }

        /**
         * @param cicsTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder cicsTransactionIds(@Nullable Output<List<String>> cicsTransactionIds) {
            $.cicsTransactionIds = cicsTransactionIds;
            return this;
        }

        /**
         * @param cicsTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder cicsTransactionIds(List<String> cicsTransactionIds) {
            return cicsTransactionIds(Output.of(cicsTransactionIds));
        }

        /**
         * @param cicsTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder cicsTransactionIds(String... cicsTransactionIds) {
            return cicsTransactionIds(List.of(cicsTransactionIds));
        }

        /**
         * @param imsTerminalTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder imsTerminalTransactionIds(@Nullable Output<List<String>> imsTerminalTransactionIds) {
            $.imsTerminalTransactionIds = imsTerminalTransactionIds;
            return this;
        }

        /**
         * @param imsTerminalTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder imsTerminalTransactionIds(List<String> imsTerminalTransactionIds) {
            return imsTerminalTransactionIds(Output.of(imsTerminalTransactionIds));
        }

        /**
         * @param imsTerminalTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder imsTerminalTransactionIds(String... imsTerminalTransactionIds) {
            return imsTerminalTransactionIds(List.of(imsTerminalTransactionIds));
        }

        /**
         * @param imsTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder imsTransactionIds(@Nullable Output<List<String>> imsTransactionIds) {
            $.imsTransactionIds = imsTransactionIds;
            return this;
        }

        /**
         * @param imsTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder imsTransactionIds(List<String> imsTransactionIds) {
            return imsTransactionIds(Output.of(imsTransactionIds));
        }

        /**
         * @param imsTransactionIds You can use * as wildcard. For example use A* to trace all transaction IDs that start with A.
         * 
         * @return builder
         * 
         */
        public Builder imsTransactionIds(String... imsTransactionIds) {
            return imsTransactionIds(List.of(imsTransactionIds));
        }

        public TransactionStartFiltersArgs build() {
            return $;
        }
    }

}
