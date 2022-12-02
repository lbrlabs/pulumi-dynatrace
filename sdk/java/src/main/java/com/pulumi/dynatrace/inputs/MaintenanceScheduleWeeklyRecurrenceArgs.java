// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs;
import com.pulumi.dynatrace.inputs.MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs;
import java.lang.String;
import java.util.Objects;


public final class MaintenanceScheduleWeeklyRecurrenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceScheduleWeeklyRecurrenceArgs Empty = new MaintenanceScheduleWeeklyRecurrenceArgs();

    @Import(name="dayOfWeek", required=true)
    private Output<String> dayOfWeek;

    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    @Import(name="recurrenceRange", required=true)
    private Output<MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs> recurrenceRange;

    public Output<MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs> recurrenceRange() {
        return this.recurrenceRange;
    }

    @Import(name="timeWindow", required=true)
    private Output<MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs> timeWindow;

    public Output<MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs> timeWindow() {
        return this.timeWindow;
    }

    private MaintenanceScheduleWeeklyRecurrenceArgs() {}

    private MaintenanceScheduleWeeklyRecurrenceArgs(MaintenanceScheduleWeeklyRecurrenceArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.recurrenceRange = $.recurrenceRange;
        this.timeWindow = $.timeWindow;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceScheduleWeeklyRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceScheduleWeeklyRecurrenceArgs $;

        public Builder() {
            $ = new MaintenanceScheduleWeeklyRecurrenceArgs();
        }

        public Builder(MaintenanceScheduleWeeklyRecurrenceArgs defaults) {
            $ = new MaintenanceScheduleWeeklyRecurrenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder dayOfWeek(Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public Builder recurrenceRange(Output<MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs> recurrenceRange) {
            $.recurrenceRange = recurrenceRange;
            return this;
        }

        public Builder recurrenceRange(MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs recurrenceRange) {
            return recurrenceRange(Output.of(recurrenceRange));
        }

        public Builder timeWindow(Output<MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs> timeWindow) {
            $.timeWindow = timeWindow;
            return this;
        }

        public Builder timeWindow(MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs timeWindow) {
            return timeWindow(Output.of(timeWindow));
        }

        public MaintenanceScheduleWeeklyRecurrenceArgs build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            $.recurrenceRange = Objects.requireNonNull($.recurrenceRange, "expected parameter 'recurrenceRange' to be non-null");
            $.timeWindow = Objects.requireNonNull($.timeWindow, "expected parameter 'timeWindow' to be non-null");
            return $;
        }
    }

}