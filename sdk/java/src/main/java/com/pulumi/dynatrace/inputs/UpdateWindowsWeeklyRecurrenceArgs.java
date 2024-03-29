// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.UpdateWindowsWeeklyRecurrenceRecurrenceRangeArgs;
import com.pulumi.dynatrace.inputs.UpdateWindowsWeeklyRecurrenceSelectedWeekDaysArgs;
import com.pulumi.dynatrace.inputs.UpdateWindowsWeeklyRecurrenceUpdateTimeArgs;
import java.lang.Integer;
import java.util.Objects;


public final class UpdateWindowsWeeklyRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final UpdateWindowsWeeklyRecurrenceArgs Empty = new UpdateWindowsWeeklyRecurrenceArgs();

    @Import(name="every", required=true)
    private Output<Integer> every;

    public Output<Integer> every() {
        return this.every;
    }

    @Import(name="recurrenceRange", required=true)
    private Output<UpdateWindowsWeeklyRecurrenceRecurrenceRangeArgs> recurrenceRange;

    public Output<UpdateWindowsWeeklyRecurrenceRecurrenceRangeArgs> recurrenceRange() {
        return this.recurrenceRange;
    }

    @Import(name="selectedWeekDays", required=true)
    private Output<UpdateWindowsWeeklyRecurrenceSelectedWeekDaysArgs> selectedWeekDays;

    public Output<UpdateWindowsWeeklyRecurrenceSelectedWeekDaysArgs> selectedWeekDays() {
        return this.selectedWeekDays;
    }

    @Import(name="updateTime", required=true)
    private Output<UpdateWindowsWeeklyRecurrenceUpdateTimeArgs> updateTime;

    public Output<UpdateWindowsWeeklyRecurrenceUpdateTimeArgs> updateTime() {
        return this.updateTime;
    }

    private UpdateWindowsWeeklyRecurrenceArgs() {}

    private UpdateWindowsWeeklyRecurrenceArgs(UpdateWindowsWeeklyRecurrenceArgs $) {
        this.every = $.every;
        this.recurrenceRange = $.recurrenceRange;
        this.selectedWeekDays = $.selectedWeekDays;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpdateWindowsWeeklyRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpdateWindowsWeeklyRecurrenceArgs $;

        public Builder() {
            $ = new UpdateWindowsWeeklyRecurrenceArgs();
        }

        public Builder(UpdateWindowsWeeklyRecurrenceArgs defaults) {
            $ = new UpdateWindowsWeeklyRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder every(Output<Integer> every) {
            $.every = every;
            return this;
        }

        public Builder every(Integer every) {
            return every(Output.of(every));
        }

        public Builder recurrenceRange(Output<UpdateWindowsWeeklyRecurrenceRecurrenceRangeArgs> recurrenceRange) {
            $.recurrenceRange = recurrenceRange;
            return this;
        }

        public Builder recurrenceRange(UpdateWindowsWeeklyRecurrenceRecurrenceRangeArgs recurrenceRange) {
            return recurrenceRange(Output.of(recurrenceRange));
        }

        public Builder selectedWeekDays(Output<UpdateWindowsWeeklyRecurrenceSelectedWeekDaysArgs> selectedWeekDays) {
            $.selectedWeekDays = selectedWeekDays;
            return this;
        }

        public Builder selectedWeekDays(UpdateWindowsWeeklyRecurrenceSelectedWeekDaysArgs selectedWeekDays) {
            return selectedWeekDays(Output.of(selectedWeekDays));
        }

        public Builder updateTime(Output<UpdateWindowsWeeklyRecurrenceUpdateTimeArgs> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(UpdateWindowsWeeklyRecurrenceUpdateTimeArgs updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public UpdateWindowsWeeklyRecurrenceArgs build() {
            $.every = Objects.requireNonNull($.every, "expected parameter 'every' to be non-null");
            $.recurrenceRange = Objects.requireNonNull($.recurrenceRange, "expected parameter 'recurrenceRange' to be non-null");
            $.selectedWeekDays = Objects.requireNonNull($.selectedWeekDays, "expected parameter 'selectedWeekDays' to be non-null");
            $.updateTime = Objects.requireNonNull($.updateTime, "expected parameter 'updateTime' to be non-null");
            return $;
        }
    }

}
