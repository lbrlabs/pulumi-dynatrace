// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.ResourceAttributesKeysRuleArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceAttributesKeysArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceAttributesKeysArgs Empty = new ResourceAttributesKeysArgs();

    @Import(name="rules")
    private @Nullable Output<List<ResourceAttributesKeysRuleArgs>> rules;

    public Optional<Output<List<ResourceAttributesKeysRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ResourceAttributesKeysArgs() {}

    private ResourceAttributesKeysArgs(ResourceAttributesKeysArgs $) {
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceAttributesKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceAttributesKeysArgs $;

        public Builder() {
            $ = new ResourceAttributesKeysArgs();
        }

        public Builder(ResourceAttributesKeysArgs defaults) {
            $ = new ResourceAttributesKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder rules(@Nullable Output<List<ResourceAttributesKeysRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<ResourceAttributesKeysRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(ResourceAttributesKeysRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public ResourceAttributesKeysArgs build() {
            return $;
        }
    }

}
