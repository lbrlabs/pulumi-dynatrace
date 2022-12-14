// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SpanAttributedArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpanAttributedArgs Empty = new SpanAttributedArgs();

    /**
     * the key of the attribute to capture
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return the key of the attribute to capture
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    private SpanAttributedArgs() {}

    private SpanAttributedArgs(SpanAttributedArgs $) {
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpanAttributedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpanAttributedArgs $;

        public Builder() {
            $ = new SpanAttributedArgs();
        }

        public Builder(SpanAttributedArgs defaults) {
            $ = new SpanAttributedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key the key of the attribute to capture
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
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

        public SpanAttributedArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
