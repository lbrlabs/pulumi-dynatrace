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


public final class BusinessEventsBucketsState extends com.pulumi.resources.ResourceArgs {

    public static final BusinessEventsBucketsState Empty = new BusinessEventsBucketsState();

    /**
     * Events will be stored in the selected bucket. Analyze bucket contents in the [log &amp; event viewer.](https://www.terraform.io/ui/logs-events?advancedQueryMode=true&amp;query=fetch+bizevents)
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return Events will be stored in the selected bucket. Analyze bucket contents in the [log &amp; event viewer.](https://www.terraform.io/ui/logs-events?advancedQueryMode=true&amp;query=fetch+bizevents)
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    /**
     * This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return This setting is enabled (`true`) or disabled (`false`)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * [See our documentation](https://dt-url.net/bp234rv)
     * 
     */
    @Import(name="matcher")
    private @Nullable Output<String> matcher;

    /**
     * @return [See our documentation](https://dt-url.net/bp234rv)
     * 
     */
    public Optional<Output<String>> matcher() {
        return Optional.ofNullable(this.matcher);
    }

    /**
     * Rule name
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Rule name
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    private BusinessEventsBucketsState() {}

    private BusinessEventsBucketsState(BusinessEventsBucketsState $) {
        this.bucketName = $.bucketName;
        this.enabled = $.enabled;
        this.matcher = $.matcher;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BusinessEventsBucketsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BusinessEventsBucketsState $;

        public Builder() {
            $ = new BusinessEventsBucketsState();
        }

        public Builder(BusinessEventsBucketsState defaults) {
            $ = new BusinessEventsBucketsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName Events will be stored in the selected bucket. Analyze bucket contents in the [log &amp; event viewer.](https://www.terraform.io/ui/logs-events?advancedQueryMode=true&amp;query=fetch+bizevents)
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName Events will be stored in the selected bucket. Analyze bucket contents in the [log &amp; event viewer.](https://www.terraform.io/ui/logs-events?advancedQueryMode=true&amp;query=fetch+bizevents)
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled This setting is enabled (`true`) or disabled (`false`)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param matcher [See our documentation](https://dt-url.net/bp234rv)
         * 
         * @return builder
         * 
         */
        public Builder matcher(@Nullable Output<String> matcher) {
            $.matcher = matcher;
            return this;
        }

        /**
         * @param matcher [See our documentation](https://dt-url.net/bp234rv)
         * 
         * @return builder
         * 
         */
        public Builder matcher(String matcher) {
            return matcher(Output.of(matcher));
        }

        /**
         * @param ruleName Rule name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Rule name
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        public BusinessEventsBucketsState build() {
            return $;
        }
    }

}
