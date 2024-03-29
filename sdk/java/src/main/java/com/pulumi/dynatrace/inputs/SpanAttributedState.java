// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpanAttributedState extends com.pulumi.resources.ResourceArgs {

    public static final SpanAttributedState Empty = new SpanAttributedState();

    /**
     * the key of the attribute to capture
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return the key of the attribute to capture
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * granular control over the visibility of attribute values
     * 
     */
    @Import(name="masking")
    private @Nullable Output<String> masking;

    /**
     * @return granular control over the visibility of attribute values
     * 
     */
    public Optional<Output<String>> masking() {
        return Optional.ofNullable(this.masking);
    }

    /**
     * Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
     * are defined by default on every Dynatrace environment.
     * 
     */
    @Import(name="persistent")
    private @Nullable Output<Boolean> persistent;

    /**
     * @return Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
     * are defined by default on every Dynatrace environment.
     * 
     */
    public Optional<Output<Boolean>> persistent() {
        return Optional.ofNullable(this.persistent);
    }

    private SpanAttributedState() {}

    private SpanAttributedState(SpanAttributedState $) {
        this.key = $.key;
        this.masking = $.masking;
        this.persistent = $.persistent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpanAttributedState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpanAttributedState $;

        public Builder() {
            $ = new SpanAttributedState();
        }

        public Builder(SpanAttributedState defaults) {
            $ = new SpanAttributedState(Objects.requireNonNull(defaults));
        }

        /**
         * @param key the key of the attribute to capture
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key the key of the attribute to capture
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param masking granular control over the visibility of attribute values
         * 
         * @return builder
         * 
         */
        public Builder masking(@Nullable Output<String> masking) {
            $.masking = masking;
            return this;
        }

        /**
         * @param masking granular control over the visibility of attribute values
         * 
         * @return builder
         * 
         */
        public Builder masking(String masking) {
            return masking(Output.of(masking));
        }

        /**
         * @param persistent Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
         * are defined by default on every Dynatrace environment.
         * 
         * @return builder
         * 
         */
        public Builder persistent(@Nullable Output<Boolean> persistent) {
            $.persistent = persistent;
            return this;
        }

        /**
         * @param persistent Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
         * are defined by default on every Dynatrace environment.
         * 
         * @return builder
         * 
         */
        public Builder persistent(Boolean persistent) {
            return persistent(Output.of(persistent));
        }

        public SpanAttributedState build() {
            return $;
        }
    }

}
