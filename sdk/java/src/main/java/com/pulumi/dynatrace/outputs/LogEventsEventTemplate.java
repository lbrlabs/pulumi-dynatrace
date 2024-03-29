// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.LogEventsEventTemplateMetadata;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LogEventsEventTemplate {
    /**
     * @return Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
     * 
     */
    private @Nullable Boolean davisMerge;
    /**
     * @return The description of the event to trigger.
     * 
     */
    private String description;
    /**
     * @return Possible Values: `AVAILABILITY`, `CUSTOM_ALERT`, `CUSTOM_ANNOTATION`, `CUSTOM_CONFIGURATION`, `CUSTOM_DEPLOYMENT`, `ERROR`, `INFO`, `MARKED_FOR_TERMINATION`, `RESOURCE`, `SLOWDOWN`
     * 
     */
    private String eventType;
    /**
     * @return Set of additional key-value properties to be attached to the triggered event.
     * 
     */
    private @Nullable LogEventsEventTemplateMetadata metadata;
    /**
     * @return The title of the event to trigger.
     * 
     */
    private String title;

    private LogEventsEventTemplate() {}
    /**
     * @return Davis® AI will try to merge this event into existing problems, otherwise a new problem will always be created.
     * 
     */
    public Optional<Boolean> davisMerge() {
        return Optional.ofNullable(this.davisMerge);
    }
    /**
     * @return The description of the event to trigger.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Possible Values: `AVAILABILITY`, `CUSTOM_ALERT`, `CUSTOM_ANNOTATION`, `CUSTOM_CONFIGURATION`, `CUSTOM_DEPLOYMENT`, `ERROR`, `INFO`, `MARKED_FOR_TERMINATION`, `RESOURCE`, `SLOWDOWN`
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return Set of additional key-value properties to be attached to the triggered event.
     * 
     */
    public Optional<LogEventsEventTemplateMetadata> metadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * @return The title of the event to trigger.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogEventsEventTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean davisMerge;
        private String description;
        private String eventType;
        private @Nullable LogEventsEventTemplateMetadata metadata;
        private String title;
        public Builder() {}
        public Builder(LogEventsEventTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.davisMerge = defaults.davisMerge;
    	      this.description = defaults.description;
    	      this.eventType = defaults.eventType;
    	      this.metadata = defaults.metadata;
    	      this.title = defaults.title;
        }

        @CustomType.Setter
        public Builder davisMerge(@Nullable Boolean davisMerge) {
            this.davisMerge = davisMerge;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable LogEventsEventTemplateMetadata metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public LogEventsEventTemplate build() {
            final var o = new LogEventsEventTemplate();
            o.davisMerge = davisMerge;
            o.description = description;
            o.eventType = eventType;
            o.metadata = metadata;
            o.title = title;
            return o;
        }
    }
}
