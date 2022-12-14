// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.HostNamingConditionConditionCustomProcessMetadataDynamicKeyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostNamingConditionConditionCustomProcessMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostNamingConditionConditionCustomProcessMetadataArgs Empty = new HostNamingConditionConditionCustomProcessMetadataArgs();

    @Import(name="attribute", required=true)
    private Output<String> attribute;

    public Output<String> attribute() {
        return this.attribute;
    }

    @Import(name="dynamicKey", required=true)
    private Output<HostNamingConditionConditionCustomProcessMetadataDynamicKeyArgs> dynamicKey;

    public Output<HostNamingConditionConditionCustomProcessMetadataDynamicKeyArgs> dynamicKey() {
        return this.dynamicKey;
    }

    @Import(name="unknowns")
    private @Nullable Output<String> unknowns;

    public Optional<Output<String>> unknowns() {
        return Optional.ofNullable(this.unknowns);
    }

    private HostNamingConditionConditionCustomProcessMetadataArgs() {}

    private HostNamingConditionConditionCustomProcessMetadataArgs(HostNamingConditionConditionCustomProcessMetadataArgs $) {
        this.attribute = $.attribute;
        this.dynamicKey = $.dynamicKey;
        this.unknowns = $.unknowns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostNamingConditionConditionCustomProcessMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostNamingConditionConditionCustomProcessMetadataArgs $;

        public Builder() {
            $ = new HostNamingConditionConditionCustomProcessMetadataArgs();
        }

        public Builder(HostNamingConditionConditionCustomProcessMetadataArgs defaults) {
            $ = new HostNamingConditionConditionCustomProcessMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        public Builder dynamicKey(Output<HostNamingConditionConditionCustomProcessMetadataDynamicKeyArgs> dynamicKey) {
            $.dynamicKey = dynamicKey;
            return this;
        }

        public Builder dynamicKey(HostNamingConditionConditionCustomProcessMetadataDynamicKeyArgs dynamicKey) {
            return dynamicKey(Output.of(dynamicKey));
        }

        public Builder unknowns(@Nullable Output<String> unknowns) {
            $.unknowns = unknowns;
            return this;
        }

        public Builder unknowns(String unknowns) {
            return unknowns(Output.of(unknowns));
        }

        public HostNamingConditionConditionCustomProcessMetadataArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.dynamicKey = Objects.requireNonNull($.dynamicKey, "expected parameter 'dynamicKey' to be non-null");
            return $;
        }
    }

}
