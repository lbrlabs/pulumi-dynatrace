// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.RequestNamingPlaceholdersPlaceholderSourceServiceTagTagKeyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs Empty = new RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs();

    @Import(name="context")
    private @Nullable Output<String> context;

    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="tagKey")
    private @Nullable Output<RequestNamingPlaceholdersPlaceholderSourceServiceTagTagKeyArgs> tagKey;

    public Optional<Output<RequestNamingPlaceholdersPlaceholderSourceServiceTagTagKeyArgs>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs() {}

    private RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs(RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs $) {
        this.context = $.context;
        this.key = $.key;
        this.tagKey = $.tagKey;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs $;

        public Builder() {
            $ = new RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs();
        }

        public Builder(RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs defaults) {
            $ = new RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        public Builder context(String context) {
            return context(Output.of(context));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder tagKey(@Nullable Output<RequestNamingPlaceholdersPlaceholderSourceServiceTagTagKeyArgs> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        public Builder tagKey(RequestNamingPlaceholdersPlaceholderSourceServiceTagTagKeyArgs tagKey) {
            return tagKey(Output.of(tagKey));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public RequestNamingPlaceholdersPlaceholderSourceServiceTagArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
