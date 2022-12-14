// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostNamingConditionConditionTechValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostNamingConditionConditionTechValueArgs Empty = new HostNamingConditionConditionTechValueArgs();

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    @Import(name="verbatimType")
    private @Nullable Output<String> verbatimType;

    public Optional<Output<String>> verbatimType() {
        return Optional.ofNullable(this.verbatimType);
    }

    private HostNamingConditionConditionTechValueArgs() {}

    private HostNamingConditionConditionTechValueArgs(HostNamingConditionConditionTechValueArgs $) {
        this.type = $.type;
        this.unknowns = $.unknowns;
        this.verbatimType = $.verbatimType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostNamingConditionConditionTechValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostNamingConditionConditionTechValueArgs $;

        public Builder() {
            $ = new HostNamingConditionConditionTechValueArgs();
        }

        public Builder(HostNamingConditionConditionTechValueArgs defaults) {
            $ = new HostNamingConditionConditionTechValueArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public Builder verbatimType(@Nullable Output<String> verbatimType) {
            $.verbatimType = verbatimType;
            return this;
        }

        public Builder verbatimType(String verbatimType) {
            return verbatimType(Output.of(verbatimType));
        }

        public HostNamingConditionConditionTechValueArgs build() {
            return $;
        }
    }

}
