// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Dynatrace.Inputs
{

    public sealed class MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs : global::Pulumi.ResourceArgs
    {
        [Input("endTime", required: true)]
        public Input<string> EndTime { get; set; } = null!;

        [Input("startTime", required: true)]
        public Input<string> StartTime { get; set; } = null!;

        [Input("timeZone", required: true)]
        public Input<string> TimeZone { get; set; } = null!;

        public MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs()
        {
        }
        public static new MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs Empty => new MaintenanceScheduleWeeklyRecurrenceTimeWindowArgs();
    }
}
