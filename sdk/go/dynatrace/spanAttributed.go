// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dynatrace

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type SpanAttributed struct {
	pulumi.CustomResourceState

	// the key of the attribute to capture
	Key pulumi.StringOutput `pulumi:"key"`
	// granular control over the visibility of attribute values
	Masking pulumi.StringOutput `pulumi:"masking"`
	// Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
	// are defined by default on every Dynatrace environment.
	Persistent pulumi.BoolOutput `pulumi:"persistent"`
}

// NewSpanAttributed registers a new resource with the given unique name, arguments, and options.
func NewSpanAttributed(ctx *pulumi.Context,
	name string, args *SpanAttributedArgs, opts ...pulumi.ResourceOption) (*SpanAttributed, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.Masking == nil {
		return nil, errors.New("invalid value for required argument 'Masking'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SpanAttributed
	err := ctx.RegisterResource("dynatrace:index/spanAttributed:SpanAttributed", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpanAttributed gets an existing SpanAttributed resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpanAttributed(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpanAttributedState, opts ...pulumi.ResourceOption) (*SpanAttributed, error) {
	var resource SpanAttributed
	err := ctx.ReadResource("dynatrace:index/spanAttributed:SpanAttributed", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SpanAttributed resources.
type spanAttributedState struct {
	// the key of the attribute to capture
	Key *string `pulumi:"key"`
	// granular control over the visibility of attribute values
	Masking *string `pulumi:"masking"`
	// Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
	// are defined by default on every Dynatrace environment.
	Persistent *bool `pulumi:"persistent"`
}

type SpanAttributedState struct {
	// the key of the attribute to capture
	Key pulumi.StringPtrInput
	// granular control over the visibility of attribute values
	Masking pulumi.StringPtrInput
	// Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
	// are defined by default on every Dynatrace environment.
	Persistent pulumi.BoolPtrInput
}

func (SpanAttributedState) ElementType() reflect.Type {
	return reflect.TypeOf((*spanAttributedState)(nil)).Elem()
}

type spanAttributedArgs struct {
	// the key of the attribute to capture
	Key string `pulumi:"key"`
	// granular control over the visibility of attribute values
	Masking string `pulumi:"masking"`
	// Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
	// are defined by default on every Dynatrace environment.
	Persistent *bool `pulumi:"persistent"`
}

// The set of arguments for constructing a SpanAttributed resource.
type SpanAttributedArgs struct {
	// the key of the attribute to capture
	Key pulumi.StringInput
	// granular control over the visibility of attribute values
	Masking pulumi.StringInput
	// Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
	// are defined by default on every Dynatrace environment.
	Persistent pulumi.BoolPtrInput
}

func (SpanAttributedArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spanAttributedArgs)(nil)).Elem()
}

type SpanAttributedInput interface {
	pulumi.Input

	ToSpanAttributedOutput() SpanAttributedOutput
	ToSpanAttributedOutputWithContext(ctx context.Context) SpanAttributedOutput
}

func (*SpanAttributed) ElementType() reflect.Type {
	return reflect.TypeOf((**SpanAttributed)(nil)).Elem()
}

func (i *SpanAttributed) ToSpanAttributedOutput() SpanAttributedOutput {
	return i.ToSpanAttributedOutputWithContext(context.Background())
}

func (i *SpanAttributed) ToSpanAttributedOutputWithContext(ctx context.Context) SpanAttributedOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpanAttributedOutput)
}

// SpanAttributedArrayInput is an input type that accepts SpanAttributedArray and SpanAttributedArrayOutput values.
// You can construct a concrete instance of `SpanAttributedArrayInput` via:
//
//	SpanAttributedArray{ SpanAttributedArgs{...} }
type SpanAttributedArrayInput interface {
	pulumi.Input

	ToSpanAttributedArrayOutput() SpanAttributedArrayOutput
	ToSpanAttributedArrayOutputWithContext(context.Context) SpanAttributedArrayOutput
}

type SpanAttributedArray []SpanAttributedInput

func (SpanAttributedArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpanAttributed)(nil)).Elem()
}

func (i SpanAttributedArray) ToSpanAttributedArrayOutput() SpanAttributedArrayOutput {
	return i.ToSpanAttributedArrayOutputWithContext(context.Background())
}

func (i SpanAttributedArray) ToSpanAttributedArrayOutputWithContext(ctx context.Context) SpanAttributedArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpanAttributedArrayOutput)
}

// SpanAttributedMapInput is an input type that accepts SpanAttributedMap and SpanAttributedMapOutput values.
// You can construct a concrete instance of `SpanAttributedMapInput` via:
//
//	SpanAttributedMap{ "key": SpanAttributedArgs{...} }
type SpanAttributedMapInput interface {
	pulumi.Input

	ToSpanAttributedMapOutput() SpanAttributedMapOutput
	ToSpanAttributedMapOutputWithContext(context.Context) SpanAttributedMapOutput
}

type SpanAttributedMap map[string]SpanAttributedInput

func (SpanAttributedMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpanAttributed)(nil)).Elem()
}

func (i SpanAttributedMap) ToSpanAttributedMapOutput() SpanAttributedMapOutput {
	return i.ToSpanAttributedMapOutputWithContext(context.Background())
}

func (i SpanAttributedMap) ToSpanAttributedMapOutputWithContext(ctx context.Context) SpanAttributedMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpanAttributedMapOutput)
}

type SpanAttributedOutput struct{ *pulumi.OutputState }

func (SpanAttributedOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SpanAttributed)(nil)).Elem()
}

func (o SpanAttributedOutput) ToSpanAttributedOutput() SpanAttributedOutput {
	return o
}

func (o SpanAttributedOutput) ToSpanAttributedOutputWithContext(ctx context.Context) SpanAttributedOutput {
	return o
}

// the key of the attribute to capture
func (o SpanAttributedOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *SpanAttributed) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// granular control over the visibility of attribute values
func (o SpanAttributedOutput) Masking() pulumi.StringOutput {
	return o.ApplyT(func(v *SpanAttributed) pulumi.StringOutput { return v.Masking }).(pulumi.StringOutput)
}

// Prevents the Span Attribute from getting deleted when running `terraform destroy` - to be used for Span Attributes that
// are defined by default on every Dynatrace environment.
func (o SpanAttributedOutput) Persistent() pulumi.BoolOutput {
	return o.ApplyT(func(v *SpanAttributed) pulumi.BoolOutput { return v.Persistent }).(pulumi.BoolOutput)
}

type SpanAttributedArrayOutput struct{ *pulumi.OutputState }

func (SpanAttributedArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SpanAttributed)(nil)).Elem()
}

func (o SpanAttributedArrayOutput) ToSpanAttributedArrayOutput() SpanAttributedArrayOutput {
	return o
}

func (o SpanAttributedArrayOutput) ToSpanAttributedArrayOutputWithContext(ctx context.Context) SpanAttributedArrayOutput {
	return o
}

func (o SpanAttributedArrayOutput) Index(i pulumi.IntInput) SpanAttributedOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SpanAttributed {
		return vs[0].([]*SpanAttributed)[vs[1].(int)]
	}).(SpanAttributedOutput)
}

type SpanAttributedMapOutput struct{ *pulumi.OutputState }

func (SpanAttributedMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SpanAttributed)(nil)).Elem()
}

func (o SpanAttributedMapOutput) ToSpanAttributedMapOutput() SpanAttributedMapOutput {
	return o
}

func (o SpanAttributedMapOutput) ToSpanAttributedMapOutputWithContext(ctx context.Context) SpanAttributedMapOutput {
	return o
}

func (o SpanAttributedMapOutput) MapIndex(k pulumi.StringInput) SpanAttributedOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SpanAttributed {
		return vs[0].(map[string]*SpanAttributed)[vs[1].(string)]
	}).(SpanAttributedOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpanAttributedInput)(nil)).Elem(), &SpanAttributed{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpanAttributedArrayInput)(nil)).Elem(), SpanAttributedArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpanAttributedMapInput)(nil)).Elem(), SpanAttributedMap{})
	pulumi.RegisterOutputType(SpanAttributedOutput{})
	pulumi.RegisterOutputType(SpanAttributedArrayOutput{})
	pulumi.RegisterOutputType(SpanAttributedMapOutput{})
}
