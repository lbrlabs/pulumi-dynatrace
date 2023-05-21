// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.dynatrace.inputs.UpdateWindowsDailyRecurrenceArgs;
import com.pulumi.dynatrace.inputs.UpdateWindowsMonthlyRecurrenceArgs;
import com.pulumi.dynatrace.inputs.UpdateWindowsOnceRecurrenceArgs;
import com.pulumi.dynatrace.inputs.UpdateWindowsWeeklyRecurrenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UpdateWindowsState extends com.pulumi.resources.ResourceArgs {

    public static final UpdateWindowsState Empty = new UpdateWindowsState();

    /**
     * no documentation available
     * 
     */
    @Import(name="dailyRecurrence")
    private @Nullable Output<UpdateWindowsDailyRecurrenceArgs> dailyRecurrence;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<UpdateWindowsDailyRecurrenceArgs>> dailyRecurrence() {
        return Optional.ofNullable(this.dailyRecurrence);
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
     * no documentation available
     * 
     */
    @Import(name="monthlyRecurrence")
    private @Nullable Output<UpdateWindowsMonthlyRecurrenceArgs> monthlyRecurrence;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<UpdateWindowsMonthlyRecurrenceArgs>> monthlyRecurrence() {
        return Optional.ofNullable(this.monthlyRecurrence);
    }

    /**
     * Name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="onceRecurrence")
    private @Nullable Output<UpdateWindowsOnceRecurrenceArgs> onceRecurrence;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<UpdateWindowsOnceRecurrenceArgs>> onceRecurrence() {
        return Optional.ofNullable(this.onceRecurrence);
    }

    /**
     * Possible Values: `MONTHLY`, `ONCE`, `DAILY`, `WEEKLY`
     * 
     */
    @Import(name="recurrence")
    private @Nullable Output<String> recurrence;

    /**
     * @return Possible Values: `MONTHLY`, `ONCE`, `DAILY`, `WEEKLY`
     * 
     */
    public Optional<Output<String>> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    /**
     * no documentation available
     * 
     */
    @Import(name="weeklyRecurrence")
    private @Nullable Output<UpdateWindowsWeeklyRecurrenceArgs> weeklyRecurrence;

    /**
     * @return no documentation available
     * 
     */
    public Optional<Output<UpdateWindowsWeeklyRecurrenceArgs>> weeklyRecurrence() {
        return Optional.ofNullable(this.weeklyRecurrence);
    }

    private UpdateWindowsState() {}

    private UpdateWindowsState(UpdateWindowsState $) {
        this.dailyRecurrence = $.dailyRecurrence;
        this.enabled = $.enabled;
        this.monthlyRecurrence = $.monthlyRecurrence;
        this.name = $.name;
        this.onceRecurrence = $.onceRecurrence;
        this.recurrence = $.recurrence;
        this.weeklyRecurrence = $.weeklyRecurrence;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpdateWindowsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpdateWindowsState $;

        public Builder() {
            $ = new UpdateWindowsState();
        }

        public Builder(UpdateWindowsState defaults) {
            $ = new UpdateWindowsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dailyRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder dailyRecurrence(@Nullable Output<UpdateWindowsDailyRecurrenceArgs> dailyRecurrence) {
            $.dailyRecurrence = dailyRecurrence;
            return this;
        }

        /**
         * @param dailyRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder dailyRecurrence(UpdateWindowsDailyRecurrenceArgs dailyRecurrence) {
            return dailyRecurrence(Output.of(dailyRecurrence));
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
         * @param monthlyRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder monthlyRecurrence(@Nullable Output<UpdateWindowsMonthlyRecurrenceArgs> monthlyRecurrence) {
            $.monthlyRecurrence = monthlyRecurrence;
            return this;
        }

        /**
         * @param monthlyRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder monthlyRecurrence(UpdateWindowsMonthlyRecurrenceArgs monthlyRecurrence) {
            return monthlyRecurrence(Output.of(monthlyRecurrence));
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param onceRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder onceRecurrence(@Nullable Output<UpdateWindowsOnceRecurrenceArgs> onceRecurrence) {
            $.onceRecurrence = onceRecurrence;
            return this;
        }

        /**
         * @param onceRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder onceRecurrence(UpdateWindowsOnceRecurrenceArgs onceRecurrence) {
            return onceRecurrence(Output.of(onceRecurrence));
        }

        /**
         * @param recurrence Possible Values: `MONTHLY`, `ONCE`, `DAILY`, `WEEKLY`
         * 
         * @return builder
         * 
         */
        public Builder recurrence(@Nullable Output<String> recurrence) {
            $.recurrence = recurrence;
            return this;
        }

        /**
         * @param recurrence Possible Values: `MONTHLY`, `ONCE`, `DAILY`, `WEEKLY`
         * 
         * @return builder
         * 
         */
        public Builder recurrence(String recurrence) {
            return recurrence(Output.of(recurrence));
        }

        /**
         * @param weeklyRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder weeklyRecurrence(@Nullable Output<UpdateWindowsWeeklyRecurrenceArgs> weeklyRecurrence) {
            $.weeklyRecurrence = weeklyRecurrence;
            return this;
        }

        /**
         * @param weeklyRecurrence no documentation available
         * 
         * @return builder
         * 
         */
        public Builder weeklyRecurrence(UpdateWindowsWeeklyRecurrenceArgs weeklyRecurrence) {
            return weeklyRecurrence(Output.of(weeklyRecurrence));
        }

        public UpdateWindowsState build() {
            return $;
        }
    }

}