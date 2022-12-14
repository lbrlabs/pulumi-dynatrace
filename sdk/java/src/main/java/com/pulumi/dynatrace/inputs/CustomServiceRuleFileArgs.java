// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomServiceRuleFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomServiceRuleFileArgs Empty = new CustomServiceRuleFileArgs();

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * The name of the custom service, displayed in the UI
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the custom service, displayed in the UI
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private CustomServiceRuleFileArgs() {}

    private CustomServiceRuleFileArgs(CustomServiceRuleFileArgs $) {
        this.match = $.match;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomServiceRuleFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomServiceRuleFileArgs $;

        public Builder() {
            $ = new CustomServiceRuleFileArgs();
        }

        public Builder(CustomServiceRuleFileArgs defaults) {
            $ = new CustomServiceRuleFileArgs(Objects.requireNonNull(defaults));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        /**
         * @param name The name of the custom service, displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the custom service, displayed in the UI
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CustomServiceRuleFileArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
