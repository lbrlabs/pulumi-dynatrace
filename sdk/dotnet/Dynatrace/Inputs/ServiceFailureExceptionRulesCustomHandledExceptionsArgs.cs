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

    public sealed class ServiceFailureExceptionRulesCustomHandledExceptionsArgs : global::Pulumi.ResourceArgs
    {
        [Input("customHandledExceptions", required: true)]
        private InputList<Inputs.ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs>? _customHandledExceptions;
        public InputList<Inputs.ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs> CustomHandledExceptions
        {
            get => _customHandledExceptions ?? (_customHandledExceptions = new InputList<Inputs.ServiceFailureExceptionRulesCustomHandledExceptionsCustomHandledExceptionArgs>());
            set => _customHandledExceptions = value;
        }

        public ServiceFailureExceptionRulesCustomHandledExceptionsArgs()
        {
        }
        public static new ServiceFailureExceptionRulesCustomHandledExceptionsArgs Empty => new ServiceFailureExceptionRulesCustomHandledExceptionsArgs();
    }
}