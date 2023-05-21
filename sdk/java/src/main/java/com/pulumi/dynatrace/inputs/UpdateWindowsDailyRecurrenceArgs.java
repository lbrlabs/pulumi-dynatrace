// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.UpdateWindowsDailyRecurrenceRecurrenceRangeArgs;
import com.pulumi.dynatrace.inputs.UpdateWindowsDailyRecurrenceUpdateTimeArgs;
import java.lang.Integer;
import java.util.Objects;


public final class UpdateWindowsDailyRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpdateWindowsDailyRecurrenceArgs Empty = new UpdateWindowsDailyRecurrenceArgs();

    @Import(name="every", required=true)
    private Output<Integer> every;

    public Output<Integer> every() {
        return this.every;
    }

    @Import(name="recurrenceRange", required=true)
    private Output<UpdateWindowsDailyRecurrenceRecurrenceRangeArgs> recurrenceRange;

    public Output<UpdateWindowsDailyRecurrenceRecurrenceRangeArgs> recurrenceRange() {
        return this.recurrenceRange;
    }

    @Import(name="updateTime", required=true)
    private Output<UpdateWindowsDailyRecurrenceUpdateTimeArgs> updateTime;

    public Output<UpdateWindowsDailyRecurrenceUpdateTimeArgs> updateTime() {
        return this.updateTime;
    }

    private UpdateWindowsDailyRecurrenceArgs() {}

    private UpdateWindowsDailyRecurrenceArgs(UpdateWindowsDailyRecurrenceArgs $) {
        this.every = $.every;
        this.recurrenceRange = $.recurrenceRange;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpdateWindowsDailyRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpdateWindowsDailyRecurrenceArgs $;

        public Builder() {
            $ = new UpdateWindowsDailyRecurrenceArgs();
        }

        public Builder(UpdateWindowsDailyRecurrenceArgs defaults) {
            $ = new UpdateWindowsDailyRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder every(Output<Integer> every) {
            $.every = every;
            return this;
        }

        public Builder every(Integer every) {
            return every(Output.of(every));
        }

        public Builder recurrenceRange(Output<UpdateWindowsDailyRecurrenceRecurrenceRangeArgs> recurrenceRange) {
            $.recurrenceRange = recurrenceRange;
            return this;
        }

        public Builder recurrenceRange(UpdateWindowsDailyRecurrenceRecurrenceRangeArgs recurrenceRange) {
            return recurrenceRange(Output.of(recurrenceRange));
        }

        public Builder updateTime(Output<UpdateWindowsDailyRecurrenceUpdateTimeArgs> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(UpdateWindowsDailyRecurrenceUpdateTimeArgs updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public UpdateWindowsDailyRecurrenceArgs build() {
            $.every = Objects.requireNonNull($.every, "expected parameter 'every' to be non-null");
            $.recurrenceRange = Objects.requireNonNull($.recurrenceRange, "expected parameter 'recurrenceRange' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}