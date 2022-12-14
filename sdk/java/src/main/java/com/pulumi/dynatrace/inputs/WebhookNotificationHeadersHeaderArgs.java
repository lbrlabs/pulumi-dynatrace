// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebhookNotificationHeadersHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebhookNotificationHeadersHeaderArgs Empty = new WebhookNotificationHeadersHeaderArgs();

    /**
     * The name of the notification configuration
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the notification configuration
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="secretValue")
    private @Nullable Output<String> secretValue;

    public Optional<Output<String>> secretValue() {
        return Optional.ofNullable(this.secretValue);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private WebhookNotificationHeadersHeaderArgs() {}

    private WebhookNotificationHeadersHeaderArgs(WebhookNotificationHeadersHeaderArgs $) {
        this.name = $.name;
        this.secretValue = $.secretValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebhookNotificationHeadersHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebhookNotificationHeadersHeaderArgs $;

        public Builder() {
            $ = new WebhookNotificationHeadersHeaderArgs();
        }

        public Builder(WebhookNotificationHeadersHeaderArgs defaults) {
            $ = new WebhookNotificationHeadersHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the notification configuration
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the notification configuration
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder secretValue(@Nullable Output<String> secretValue) {
            $.secretValue = secretValue;
            return this;
        }

        public Builder secretValue(String secretValue) {
            return secretValue(Output.of(secretValue));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public WebhookNotificationHeadersHeaderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
