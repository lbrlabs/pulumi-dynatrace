// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type VictorOpsNotification struct {
	pulumi.CustomResourceState

	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolOutput `pulumi:"active"`
	// The API key for the target VictorOps account
	ApiKey pulumi.StringPtrOutput `pulumi:"apiKey"`
	// The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
	Message pulumi.StringOutput `pulumi:"message"`
	// The name of the notification configuration
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile pulumi.StringOutput `pulumi:"profile"`
	// The routing key, defining the group to be notified
	RoutingKey pulumi.StringOutput `pulumi:"routingKey"`
}

// NewVictorOpsNotification registers a new resource with the given unique name, arguments, and options.
func NewVictorOpsNotification(ctx *pulumi.Context,
	name string, args *VictorOpsNotificationArgs, opts ...pulumi.ResourceOption) (*VictorOpsNotification, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Active == nil {
		return nil, errors.New("invalid value for required argument 'Active'")
	}
	if args.Message == nil {
		return nil, errors.New("invalid value for required argument 'Message'")
	}
	if args.Profile == nil {
		return nil, errors.New("invalid value for required argument 'Profile'")
	}
	if args.RoutingKey == nil {
		return nil, errors.New("invalid value for required argument 'RoutingKey'")
	}
	if args.ApiKey != nil {
		args.ApiKey = pulumi.ToSecret(args.ApiKey).(pulumi.StringPtrOutput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"apiKey",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource VictorOpsNotification
	err := ctx.RegisterResource("dynatrace:index/victorOpsNotification:VictorOpsNotification", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVictorOpsNotification gets an existing VictorOpsNotification resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVictorOpsNotification(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VictorOpsNotificationState, opts ...pulumi.ResourceOption) (*VictorOpsNotification, error) {
	var resource VictorOpsNotification
	err := ctx.ReadResource("dynatrace:index/victorOpsNotification:VictorOpsNotification", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VictorOpsNotification resources.
type victorOpsNotificationState struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active *bool `pulumi:"active"`
	// The API key for the target VictorOps account
	ApiKey *string `pulumi:"apiKey"`
	// The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
	Message *string `pulumi:"message"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile *string `pulumi:"profile"`
	// The routing key, defining the group to be notified
	RoutingKey *string `pulumi:"routingKey"`
}

type VictorOpsNotificationState struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolPtrInput
	// The API key for the target VictorOps account
	ApiKey pulumi.StringPtrInput
	// The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
	Message pulumi.StringPtrInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringPtrInput
	// The routing key, defining the group to be notified
	RoutingKey pulumi.StringPtrInput
}

func (VictorOpsNotificationState) ElementType() reflect.Type {
	return reflect.TypeOf((*victorOpsNotificationState)(nil)).Elem()
}

type victorOpsNotificationArgs struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active bool `pulumi:"active"`
	// The API key for the target VictorOps account
	ApiKey *string `pulumi:"apiKey"`
	// The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
	Message string `pulumi:"message"`
	// The name of the notification configuration
	Name *string `pulumi:"name"`
	// The ID of the associated alerting profile
	Profile string `pulumi:"profile"`
	// The routing key, defining the group to be notified
	RoutingKey string `pulumi:"routingKey"`
}

// The set of arguments for constructing a VictorOpsNotification resource.
type VictorOpsNotificationArgs struct {
	// The configuration is enabled (`true`) or disabled (`false`)
	Active pulumi.BoolInput
	// The API key for the target VictorOps account
	ApiKey pulumi.StringPtrInput
	// The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
	Message pulumi.StringInput
	// The name of the notification configuration
	Name pulumi.StringPtrInput
	// The ID of the associated alerting profile
	Profile pulumi.StringInput
	// The routing key, defining the group to be notified
	RoutingKey pulumi.StringInput
}

func (VictorOpsNotificationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*victorOpsNotificationArgs)(nil)).Elem()
}

type VictorOpsNotificationInput interface {
	pulumi.Input

	ToVictorOpsNotificationOutput() VictorOpsNotificationOutput
	ToVictorOpsNotificationOutputWithContext(ctx context.Context) VictorOpsNotificationOutput
}

func (*VictorOpsNotification) ElementType() reflect.Type {
	return reflect.TypeOf((**VictorOpsNotification)(nil)).Elem()
}

func (i *VictorOpsNotification) ToVictorOpsNotificationOutput() VictorOpsNotificationOutput {
	return i.ToVictorOpsNotificationOutputWithContext(context.Background())
}

func (i *VictorOpsNotification) ToVictorOpsNotificationOutputWithContext(ctx context.Context) VictorOpsNotificationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VictorOpsNotificationOutput)
}

// VictorOpsNotificationArrayInput is an input type that accepts VictorOpsNotificationArray and VictorOpsNotificationArrayOutput values.
// You can construct a concrete instance of `VictorOpsNotificationArrayInput` via:
//
//	VictorOpsNotificationArray{ VictorOpsNotificationArgs{...} }
type VictorOpsNotificationArrayInput interface {
	pulumi.Input

	ToVictorOpsNotificationArrayOutput() VictorOpsNotificationArrayOutput
	ToVictorOpsNotificationArrayOutputWithContext(context.Context) VictorOpsNotificationArrayOutput
}

type VictorOpsNotificationArray []VictorOpsNotificationInput

func (VictorOpsNotificationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VictorOpsNotification)(nil)).Elem()
}

func (i VictorOpsNotificationArray) ToVictorOpsNotificationArrayOutput() VictorOpsNotificationArrayOutput {
	return i.ToVictorOpsNotificationArrayOutputWithContext(context.Background())
}

func (i VictorOpsNotificationArray) ToVictorOpsNotificationArrayOutputWithContext(ctx context.Context) VictorOpsNotificationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VictorOpsNotificationArrayOutput)
}

// VictorOpsNotificationMapInput is an input type that accepts VictorOpsNotificationMap and VictorOpsNotificationMapOutput values.
// You can construct a concrete instance of `VictorOpsNotificationMapInput` via:
//
//	VictorOpsNotificationMap{ "key": VictorOpsNotificationArgs{...} }
type VictorOpsNotificationMapInput interface {
	pulumi.Input

	ToVictorOpsNotificationMapOutput() VictorOpsNotificationMapOutput
	ToVictorOpsNotificationMapOutputWithContext(context.Context) VictorOpsNotificationMapOutput
}

type VictorOpsNotificationMap map[string]VictorOpsNotificationInput

func (VictorOpsNotificationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VictorOpsNotification)(nil)).Elem()
}

func (i VictorOpsNotificationMap) ToVictorOpsNotificationMapOutput() VictorOpsNotificationMapOutput {
	return i.ToVictorOpsNotificationMapOutputWithContext(context.Background())
}

func (i VictorOpsNotificationMap) ToVictorOpsNotificationMapOutputWithContext(ctx context.Context) VictorOpsNotificationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VictorOpsNotificationMapOutput)
}

type VictorOpsNotificationOutput struct{ *pulumi.OutputState }

func (VictorOpsNotificationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VictorOpsNotification)(nil)).Elem()
}

func (o VictorOpsNotificationOutput) ToVictorOpsNotificationOutput() VictorOpsNotificationOutput {
	return o
}

func (o VictorOpsNotificationOutput) ToVictorOpsNotificationOutputWithContext(ctx context.Context) VictorOpsNotificationOutput {
	return o
}

// The configuration is enabled (`true`) or disabled (`false`)
func (o VictorOpsNotificationOutput) Active() pulumi.BoolOutput {
	return o.ApplyT(func(v *VictorOpsNotification) pulumi.BoolOutput { return v.Active }).(pulumi.BoolOutput)
}

// The API key for the target VictorOps account
func (o VictorOpsNotificationOutput) ApiKey() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VictorOpsNotification) pulumi.StringPtrOutput { return v.ApiKey }).(pulumi.StringPtrOutput)
}

// The content of the message.  You can use the following placeholders:  * `{ImpactedEntity}`: The entity impacted by the problem or *X* impacted entities.  * `{ProblemDetailsText}`: All problem event details, including root cause, as a text-formatted string.  * `{ProblemID}`: The display number of the reported problem.  * `{ProblemImpact}`: The [impact level](https://www.dynatrace.com/support/help/shortlink/impact-analysis) of the problem. Possible values are `APPLICATION`, `SERVICE`, and `INFRASTRUCTURE`.  * `{ProblemSeverity}`: The [severity level](https://www.dynatrace.com/support/help/shortlink/event-types) of the problem. Possible values are `AVAILABILITY`, `ERROR`, `PERFORMANCE`, `RESOURCE_CONTENTION`, and `CUSTOM_ALERT`.  * `{ProblemTitle}`: A short description of the problem.  * `{ProblemURL}`: The URL of the problem within Dynatrace.  * `{State}`: The state of the problem. Possible values are `OPEN` and `RESOLVED`
func (o VictorOpsNotificationOutput) Message() pulumi.StringOutput {
	return o.ApplyT(func(v *VictorOpsNotification) pulumi.StringOutput { return v.Message }).(pulumi.StringOutput)
}

// The name of the notification configuration
func (o VictorOpsNotificationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VictorOpsNotification) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the associated alerting profile
func (o VictorOpsNotificationOutput) Profile() pulumi.StringOutput {
	return o.ApplyT(func(v *VictorOpsNotification) pulumi.StringOutput { return v.Profile }).(pulumi.StringOutput)
}

// The routing key, defining the group to be notified
func (o VictorOpsNotificationOutput) RoutingKey() pulumi.StringOutput {
	return o.ApplyT(func(v *VictorOpsNotification) pulumi.StringOutput { return v.RoutingKey }).(pulumi.StringOutput)
}

type VictorOpsNotificationArrayOutput struct{ *pulumi.OutputState }

func (VictorOpsNotificationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VictorOpsNotification)(nil)).Elem()
}

func (o VictorOpsNotificationArrayOutput) ToVictorOpsNotificationArrayOutput() VictorOpsNotificationArrayOutput {
	return o
}

func (o VictorOpsNotificationArrayOutput) ToVictorOpsNotificationArrayOutputWithContext(ctx context.Context) VictorOpsNotificationArrayOutput {
	return o
}

func (o VictorOpsNotificationArrayOutput) Index(i pulumi.IntInput) VictorOpsNotificationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VictorOpsNotification {
		return vs[0].([]*VictorOpsNotification)[vs[1].(int)]
	}).(VictorOpsNotificationOutput)
}

type VictorOpsNotificationMapOutput struct{ *pulumi.OutputState }

func (VictorOpsNotificationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VictorOpsNotification)(nil)).Elem()
}

func (o VictorOpsNotificationMapOutput) ToVictorOpsNotificationMapOutput() VictorOpsNotificationMapOutput {
	return o
}

func (o VictorOpsNotificationMapOutput) ToVictorOpsNotificationMapOutputWithContext(ctx context.Context) VictorOpsNotificationMapOutput {
	return o
}

func (o VictorOpsNotificationMapOutput) MapIndex(k pulumi.StringInput) VictorOpsNotificationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VictorOpsNotification {
		return vs[0].(map[string]*VictorOpsNotification)[vs[1].(string)]
	}).(VictorOpsNotificationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VictorOpsNotificationInput)(nil)).Elem(), &VictorOpsNotification{})
	pulumi.RegisterInputType(reflect.TypeOf((*VictorOpsNotificationArrayInput)(nil)).Elem(), VictorOpsNotificationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VictorOpsNotificationMapInput)(nil)).Elem(), VictorOpsNotificationMap{})
	pulumi.RegisterOutputType(VictorOpsNotificationOutput{})
	pulumi.RegisterOutputType(VictorOpsNotificationArrayOutput{})
	pulumi.RegisterOutputType(VictorOpsNotificationMapOutput{})
}
