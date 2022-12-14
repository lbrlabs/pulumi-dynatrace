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


public final class QueueManagerAliasQueueAliasQueueArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueManagerAliasQueueAliasQueueArgs Empty = new QueueManagerAliasQueueAliasQueueArgs();

    @Import(name="aliasQueueName", required=true)
    private Output<String> aliasQueueName;

    public Output<String> aliasQueueName() {
        return this.aliasQueueName;
    }

    @Import(name="baseQueueName", required=true)
    private Output<String> baseQueueName;

    public Output<String> baseQueueName() {
        return this.baseQueueName;
    }

    @Import(name="clusterVisibilities")
    private @Nullable Output<List<String>> clusterVisibilities;

    public Optional<Output<List<String>>> clusterVisibilities() {
        return Optional.ofNullable(this.clusterVisibilities);
    }

    private QueueManagerAliasQueueAliasQueueArgs() {}

    private QueueManagerAliasQueueAliasQueueArgs(QueueManagerAliasQueueAliasQueueArgs $) {
        this.aliasQueueName = $.aliasQueueName;
        this.baseQueueName = $.baseQueueName;
        this.clusterVisibilities = $.clusterVisibilities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueManagerAliasQueueAliasQueueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueManagerAliasQueueAliasQueueArgs $;

        public Builder() {
            $ = new QueueManagerAliasQueueAliasQueueArgs();
        }

        public Builder(QueueManagerAliasQueueAliasQueueArgs defaults) {
            $ = new QueueManagerAliasQueueAliasQueueArgs(Objects.requireNonNull(defaults));
        }

        public Builder aliasQueueName(Output<String> aliasQueueName) {
            $.aliasQueueName = aliasQueueName;
            return this;
        }

        public Builder aliasQueueName(String aliasQueueName) {
            return aliasQueueName(Output.of(aliasQueueName));
        }

        public Builder baseQueueName(Output<String> baseQueueName) {
            $.baseQueueName = baseQueueName;
            return this;
        }

        public Builder baseQueueName(String baseQueueName) {
            return baseQueueName(Output.of(baseQueueName));
        }

        public Builder clusterVisibilities(@Nullable Output<List<String>> clusterVisibilities) {
            $.clusterVisibilities = clusterVisibilities;
            return this;
        }

        public Builder clusterVisibilities(List<String> clusterVisibilities) {
            return clusterVisibilities(Output.of(clusterVisibilities));
        }

        public Builder clusterVisibilities(String... clusterVisibilities) {
            return clusterVisibilities(List.of(clusterVisibilities));
        }

        public QueueManagerAliasQueueAliasQueueArgs build() {
            $.aliasQueueName = Objects.requireNonNull($.aliasQueueName, "expected parameter 'aliasQueueName' to be non-null");
            $.baseQueueName = Objects.requireNonNull($.baseQueueName, "expected parameter 'baseQueueName' to be non-null");
            return $;
        }
    }

}
