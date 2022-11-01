// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs Empty = new MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs();

    @Import(name="endDate", required=true)
    private Output<String> endDate;

    public Output<String> endDate() {
        return this.endDate;
    }

    @Import(name="startDate", required=true)
    private Output<String> startDate;

    public Output<String> startDate() {
        return this.startDate;
    }

    private MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs() {}

    private MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs(MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs $;

        public Builder() {
            $ = new MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs();
        }

        public Builder(MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs defaults) {
            $ = new MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder endDate(Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        public Builder startDate(Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        public MaintenanceScheduleWeeklyRecurrenceRecurrenceRangeArgs build() {
            $.endDate = Objects.requireNonNull($.endDate, "expected parameter 'endDate' to be non-null");
            $.startDate = Objects.requireNonNull($.startDate, "expected parameter 'startDate' to be non-null");
            return $;
        }
    }

}
