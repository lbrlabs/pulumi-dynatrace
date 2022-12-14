// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dynatrace.outputs.BrowserMonitorScriptEventsEventSelectSelectionsOption;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BrowserMonitorScriptEventsEventSelectSelections {
    private List<BrowserMonitorScriptEventsEventSelectSelectionsOption> options;

    private BrowserMonitorScriptEventsEventSelectSelections() {}
    public List<BrowserMonitorScriptEventsEventSelectSelectionsOption> options() {
        return this.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrowserMonitorScriptEventsEventSelectSelections defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<BrowserMonitorScriptEventsEventSelectSelectionsOption> options;
        public Builder() {}
        public Builder(BrowserMonitorScriptEventsEventSelectSelections defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.options = defaults.options;
        }

        @CustomType.Setter
        public Builder options(List<BrowserMonitorScriptEventsEventSelectSelectionsOption> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(BrowserMonitorScriptEventsEventSelectSelectionsOption... options) {
            return options(List.of(options));
        }
        public BrowserMonitorScriptEventsEventSelectSelections build() {
            final var o = new BrowserMonitorScriptEventsEventSelectSelections();
            o.options = options;
            return o;
        }
    }
}
