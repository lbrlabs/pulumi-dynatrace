// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dynatrace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloState extends com.pulumi.resources.ResourceArgs {

    public static final SloState Empty = new SloState();

    /**
     * The total count metric (the denominator in rate calculation)
     * 
     */
    @Import(name="denominator")
    private @Nullable Output<String> denominator;

    /**
     * @return The total count metric (the denominator in rate calculation)
     * 
     */
    public Optional<Output<String>> denominator() {
        return Optional.ofNullable(this.denominator);
    }

    /**
     * The custom description of the SLO (optional)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The custom description of the SLO (optional)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The SLO is enabled (`false`) or disabled (`true`)
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return The SLO is enabled (`false`) or disabled (`true`)
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The evaluation type of the SLO. Currently only `AGGREGATE` is supported
     * 
     */
    @Import(name="evaluation")
    private @Nullable Output<String> evaluation;

    /**
     * @return The evaluation type of the SLO. Currently only `AGGREGATE` is supported
     * 
     */
    public Optional<Output<String>> evaluation() {
        return Optional.ofNullable(this.evaluation);
    }

    /**
     * The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
     * 
     */
    @Import(name="filter")
    private @Nullable Output<String> filter;

    /**
     * @return The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
     * 
     */
    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    /**
     * The percentage-based metric expression for the calculation of the SLO
     * 
     */
    @Import(name="metricExpression")
    private @Nullable Output<String> metricExpression;

    /**
     * @return The percentage-based metric expression for the calculation of the SLO
     * 
     */
    public Optional<Output<String>> metricExpression() {
        return Optional.ofNullable(this.metricExpression);
    }

    /**
     * The name of the rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The metric for the count of successes (the numerator in rate calculation)
     * 
     * @deprecated
     * `numerator` and `denominator` have been replaced by `metric_expression`
     * 
     */
    @Deprecated /* `numerator` and `denominator` have been replaced by `metric_expression` */
    @Import(name="numerator")
    private @Nullable Output<String> numerator;

    /**
     * @return The metric for the count of successes (the numerator in rate calculation)
     * 
     * @deprecated
     * `numerator` and `denominator` have been replaced by `metric_expression`
     * 
     */
    @Deprecated /* `numerator` and `denominator` have been replaced by `metric_expression` */
    public Optional<Output<String>> numerator() {
        return Optional.ofNullable(this.numerator);
    }

    /**
     * The percentage-based metric for the calculation of the SLO
     * 
     */
    @Import(name="rate")
    private @Nullable Output<String> rate;

    /**
     * @return The percentage-based metric for the calculation of the SLO
     * 
     */
    public Optional<Output<String>> rate() {
        return Optional.ofNullable(this.rate);
    }

    /**
     * The target value of the SLO
     * 
     */
    @Import(name="target")
    private @Nullable Output<Double> target;

    /**
     * @return The target value of the SLO
     * 
     */
    public Optional<Output<Double>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
     * 
     */
    @Import(name="timeframe")
    private @Nullable Output<String> timeframe;

    /**
     * @return The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
     * 
     */
    public Optional<Output<String>> timeframe() {
        return Optional.ofNullable(this.timeframe);
    }

    /**
     * The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
     * 
     */
    @Import(name="warning")
    private @Nullable Output<Double> warning;

    /**
     * @return The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
     * 
     */
    public Optional<Output<Double>> warning() {
        return Optional.ofNullable(this.warning);
    }

    private SloState() {}

    private SloState(SloState $) {
        this.denominator = $.denominator;
        this.description = $.description;
        this.disabled = $.disabled;
        this.evaluation = $.evaluation;
        this.filter = $.filter;
        this.metricExpression = $.metricExpression;
        this.name = $.name;
        this.numerator = $.numerator;
        this.rate = $.rate;
        this.target = $.target;
        this.timeframe = $.timeframe;
        this.warning = $.warning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloState $;

        public Builder() {
            $ = new SloState();
        }

        public Builder(SloState defaults) {
            $ = new SloState(Objects.requireNonNull(defaults));
        }

        /**
         * @param denominator The total count metric (the denominator in rate calculation)
         * 
         * @return builder
         * 
         */
        public Builder denominator(@Nullable Output<String> denominator) {
            $.denominator = denominator;
            return this;
        }

        /**
         * @param denominator The total count metric (the denominator in rate calculation)
         * 
         * @return builder
         * 
         */
        public Builder denominator(String denominator) {
            return denominator(Output.of(denominator));
        }

        /**
         * @param description The custom description of the SLO (optional)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The custom description of the SLO (optional)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled The SLO is enabled (`false`) or disabled (`true`)
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled The SLO is enabled (`false`) or disabled (`true`)
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param evaluation The evaluation type of the SLO. Currently only `AGGREGATE` is supported
         * 
         * @return builder
         * 
         */
        public Builder evaluation(@Nullable Output<String> evaluation) {
            $.evaluation = evaluation;
            return this;
        }

        /**
         * @param evaluation The evaluation type of the SLO. Currently only `AGGREGATE` is supported
         * 
         * @return builder
         * 
         */
        public Builder evaluation(String evaluation) {
            return evaluation(Output.of(evaluation));
        }

        /**
         * @param filter The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The entity filter for the SLO evaluation. Use the [syntax of entity selector](https://dt-url.net/entityselector)
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param metricExpression The percentage-based metric expression for the calculation of the SLO
         * 
         * @return builder
         * 
         */
        public Builder metricExpression(@Nullable Output<String> metricExpression) {
            $.metricExpression = metricExpression;
            return this;
        }

        /**
         * @param metricExpression The percentage-based metric expression for the calculation of the SLO
         * 
         * @return builder
         * 
         */
        public Builder metricExpression(String metricExpression) {
            return metricExpression(Output.of(metricExpression));
        }

        /**
         * @param name The name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param numerator The metric for the count of successes (the numerator in rate calculation)
         * 
         * @return builder
         * 
         * @deprecated
         * `numerator` and `denominator` have been replaced by `metric_expression`
         * 
         */
        @Deprecated /* `numerator` and `denominator` have been replaced by `metric_expression` */
        public Builder numerator(@Nullable Output<String> numerator) {
            $.numerator = numerator;
            return this;
        }

        /**
         * @param numerator The metric for the count of successes (the numerator in rate calculation)
         * 
         * @return builder
         * 
         * @deprecated
         * `numerator` and `denominator` have been replaced by `metric_expression`
         * 
         */
        @Deprecated /* `numerator` and `denominator` have been replaced by `metric_expression` */
        public Builder numerator(String numerator) {
            return numerator(Output.of(numerator));
        }

        /**
         * @param rate The percentage-based metric for the calculation of the SLO
         * 
         * @return builder
         * 
         */
        public Builder rate(@Nullable Output<String> rate) {
            $.rate = rate;
            return this;
        }

        /**
         * @param rate The percentage-based metric for the calculation of the SLO
         * 
         * @return builder
         * 
         */
        public Builder rate(String rate) {
            return rate(Output.of(rate));
        }

        /**
         * @param target The target value of the SLO
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<Double> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target value of the SLO
         * 
         * @return builder
         * 
         */
        public Builder target(Double target) {
            return target(Output.of(target));
        }

        /**
         * @param timeframe The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
         * 
         * @return builder
         * 
         */
        public Builder timeframe(@Nullable Output<String> timeframe) {
            $.timeframe = timeframe;
            return this;
        }

        /**
         * @param timeframe The timeframe for the SLO evaluation. Use the syntax of the global timeframe selector
         * 
         * @return builder
         * 
         */
        public Builder timeframe(String timeframe) {
            return timeframe(Output.of(timeframe));
        }

        /**
         * @param warning The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
         * 
         * @return builder
         * 
         */
        public Builder warning(@Nullable Output<Double> warning) {
            $.warning = warning;
            return this;
        }

        /**
         * @param warning The warning value of the SLO. At warning state the SLO is still fulfilled but is getting close to failure
         * 
         * @return builder
         * 
         */
        public Builder warning(Double warning) {
            return warning(Output.of(warning));
        }

        public SloState build() {
            return $;
        }
    }

}
