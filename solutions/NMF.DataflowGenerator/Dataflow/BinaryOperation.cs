//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2016.LiveContest.Dataflow
{
    
    
    /// <summary>
    /// The default implementation of the BinaryOperation class
    /// </summary>
    [XmlNamespaceAttribute("http://transformation-tool-contest.eu/2016/dataflow")]
    [XmlNamespacePrefixAttribute("df")]
    [ModelRepresentationClassAttribute("http://transformation-tool-contest.eu/2016/dataflow#//BinaryOperation/")]
    public class BinaryOperation : Expression, IBinaryOperation, IModelElement
    {
        
        /// <summary>
        /// The backing field for the Operator property
        /// </summary>
        private Nullable<BinaryOperator> _operator;
        
        /// <summary>
        /// The backing field for the LeftExpression property
        /// </summary>
        private IExpression _leftExpression;
        
        /// <summary>
        /// The backing field for the RightExpression property
        /// </summary>
        private IExpression _rightExpression;
        
        /// <summary>
        /// The operator property
        /// </summary>
        [XmlElementNameAttribute("operator")]
        [XmlAttributeAttribute(true)]
        public virtual Nullable<BinaryOperator> Operator
        {
            get
            {
                return this._operator;
            }
            set
            {
                if ((this._operator != value))
                {
                    Nullable<BinaryOperator> old = this._operator;
                    this._operator = value;
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnOperatorChanged(e);
                    this.OnPropertyChanged("Operator", e);
                }
            }
        }
        
        /// <summary>
        /// The leftExpression property
        /// </summary>
        [XmlElementNameAttribute("leftExpression")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        public virtual IExpression LeftExpression
        {
            get
            {
                return this._leftExpression;
            }
            set
            {
                if ((this._leftExpression != value))
                {
                    IExpression old = this._leftExpression;
                    this._leftExpression = value;
                    if ((old != null))
                    {
                        old.Parent = null;
                        old.Deleted -= this.OnResetLeftExpression;
                    }
                    if ((value != null))
                    {
                        value.Parent = this;
                        value.Deleted += this.OnResetLeftExpression;
                    }
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnLeftExpressionChanged(e);
                    this.OnPropertyChanged("LeftExpression", e);
                }
            }
        }
        
        /// <summary>
        /// The rightExpression property
        /// </summary>
        [XmlElementNameAttribute("rightExpression")]
        [XmlAttributeAttribute(false)]
        [ContainmentAttribute()]
        public virtual IExpression RightExpression
        {
            get
            {
                return this._rightExpression;
            }
            set
            {
                if ((this._rightExpression != value))
                {
                    IExpression old = this._rightExpression;
                    this._rightExpression = value;
                    if ((old != null))
                    {
                        old.Parent = null;
                        old.Deleted -= this.OnResetRightExpression;
                    }
                    if ((value != null))
                    {
                        value.Parent = this;
                        value.Deleted += this.OnResetRightExpression;
                    }
                    ValueChangedEventArgs e = new ValueChangedEventArgs(old, value);
                    this.OnRightExpressionChanged(e);
                    this.OnPropertyChanged("RightExpression", e);
                }
            }
        }
        
        /// <summary>
        /// Gets the child model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> Children
        {
            get
            {
                return base.Children.Concat(new BinaryOperationChildrenCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the referenced model elements of this model element
        /// </summary>
        public override IEnumerableExpression<IModelElement> ReferencedElements
        {
            get
            {
                return base.ReferencedElements.Concat(new BinaryOperationReferencedElementsCollection(this));
            }
        }
        
        /// <summary>
        /// Gets the Class element that describes the structure of this type
        /// </summary>
        public new static NMF.Models.Meta.IClass ClassInstance
        {
            get
            {
                return NMF.Models.Repository.MetaRepository.Instance.ResolveClass("http://transformation-tool-contest.eu/2016/dataflow#//BinaryOperation/");
            }
        }
        
        /// <summary>
        /// Gets fired when the Operator property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> OperatorChanged;
        
        /// <summary>
        /// Gets fired when the LeftExpression property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> LeftExpressionChanged;
        
        /// <summary>
        /// Gets fired when the RightExpression property changed its value
        /// </summary>
        public event EventHandler<ValueChangedEventArgs> RightExpressionChanged;
        
        /// <summary>
        /// Raises the OperatorChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnOperatorChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.OperatorChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Raises the LeftExpressionChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnLeftExpressionChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.LeftExpressionChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the LeftExpression property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetLeftExpression(object sender, EventArgs eventArgs)
        {
            this.LeftExpression = null;
        }
        
        /// <summary>
        /// Raises the RightExpressionChanged event
        /// </summary>
        /// <param name="eventArgs">The event data</param>
        protected virtual void OnRightExpressionChanged(ValueChangedEventArgs eventArgs)
        {
            EventHandler<ValueChangedEventArgs> handler = this.RightExpressionChanged;
            if ((handler != null))
            {
                handler.Invoke(this, eventArgs);
            }
        }
        
        /// <summary>
        /// Handles the event that the RightExpression property must reset
        /// </summary>
        /// <param name="sender">The object that sent this reset request</param>
        /// <param name="eventArgs">The event data for the reset event</param>
        private void OnResetRightExpression(object sender, EventArgs eventArgs)
        {
            this.RightExpression = null;
        }
        
        /// <summary>
        /// Gets the relative URI fragment for the given child model element
        /// </summary>
        /// <returns>A fragment of the relative URI</returns>
        /// <param name="element">The element that should be looked for</param>
        protected override string GetRelativePathForNonIdentifiedChild(IModelElement element)
        {
            if ((element == this.LeftExpression))
            {
                return ModelHelper.CreatePath("LeftExpression");
            }
            if ((element == this.RightExpression))
            {
                return ModelHelper.CreatePath("RightExpression");
            }
            return base.GetRelativePathForNonIdentifiedChild(element);
        }
        
        /// <summary>
        /// Resolves the given URI to a child model element
        /// </summary>
        /// <returns>The model element or null if it could not be found</returns>
        /// <param name="reference">The requested reference name</param>
        /// <param name="index">The index of this reference</param>
        protected override IModelElement GetModelElementForReference(string reference, int index)
        {
            if ((reference == "LEFTEXPRESSION"))
            {
                return this.LeftExpression;
            }
            if ((reference == "RIGHTEXPRESSION"))
            {
                return this.RightExpression;
            }
            return base.GetModelElementForReference(reference, index);
        }
        
        /// <summary>
        /// Resolves the given attribute name
        /// </summary>
        /// <returns>The attribute value or null if it could not be found</returns>
        /// <param name="attribute">The requested attribute name</param>
        /// <param name="index">The index of this attribute</param>
        protected override object GetAttributeValue(string attribute, int index)
        {
            if ((attribute == "OPERATOR"))
            {
                return this.Operator;
            }
            return base.GetAttributeValue(attribute, index);
        }
        
        /// <summary>
        /// Sets a value to the given feature
        /// </summary>
        /// <param name="feature">The requested feature</param>
        /// <param name="value">The value that should be set to that feature</param>
        protected override void SetFeature(string feature, object value)
        {
            if ((feature == "LEFTEXPRESSION"))
            {
                this.LeftExpression = ((IExpression)(value));
                return;
            }
            if ((feature == "RIGHTEXPRESSION"))
            {
                this.RightExpression = ((IExpression)(value));
                return;
            }
            if ((feature == "OPERATOR"))
            {
                this.Operator = ((BinaryOperator)(value));
                return;
            }
            base.SetFeature(feature, value);
        }
        
        /// <summary>
        /// Gets the property expression for the given attribute
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="attribute">The requested attribute in upper case</param>
        protected override NMF.Expressions.INotifyExpression<object> GetExpressionForAttribute(string attribute)
        {
            if ((attribute == "LEFTEXPRESSION"))
            {
                return new LeftExpressionProxy(this);
            }
            if ((attribute == "RIGHTEXPRESSION"))
            {
                return new RightExpressionProxy(this);
            }
            return base.GetExpressionForAttribute(attribute);
        }
        
        /// <summary>
        /// Gets the property expression for the given reference
        /// </summary>
        /// <returns>An incremental property expression</returns>
        /// <param name="reference">The requested reference in upper case</param>
        protected override NMF.Expressions.INotifyExpression<NMF.Models.IModelElement> GetExpressionForReference(string reference)
        {
            if ((reference == "LEFTEXPRESSION"))
            {
                return new LeftExpressionProxy(this);
            }
            if ((reference == "RIGHTEXPRESSION"))
            {
                return new RightExpressionProxy(this);
            }
            return base.GetExpressionForReference(reference);
        }
        
        /// <summary>
        /// Gets the Class for this model element
        /// </summary>
        public override IClass GetClass()
        {
            return ((IClass)(NMF.Models.Repository.MetaRepository.Instance.Resolve("http://transformation-tool-contest.eu/2016/dataflow#//BinaryOperation/")));
        }
        
        /// <summary>
        /// The collection class to to represent the children of the BinaryOperation class
        /// </summary>
        public class BinaryOperationChildrenCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private BinaryOperation _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public BinaryOperationChildrenCollection(BinaryOperation parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.LeftExpression != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.RightExpression != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.LeftExpressionChanged += this.PropagateValueChanges;
                this._parent.RightExpressionChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.LeftExpressionChanged -= this.PropagateValueChanges;
                this._parent.RightExpressionChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.LeftExpression == null))
                {
                    IExpression leftExpressionCasted = item.As<IExpression>();
                    if ((leftExpressionCasted != null))
                    {
                        this._parent.LeftExpression = leftExpressionCasted;
                        return;
                    }
                }
                if ((this._parent.RightExpression == null))
                {
                    IExpression rightExpressionCasted = item.As<IExpression>();
                    if ((rightExpressionCasted != null))
                    {
                        this._parent.RightExpression = rightExpressionCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.LeftExpression = null;
                this._parent.RightExpression = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.LeftExpression))
                {
                    return true;
                }
                if ((item == this._parent.RightExpression))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.LeftExpression != null))
                {
                    array[arrayIndex] = this._parent.LeftExpression;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.RightExpression != null))
                {
                    array[arrayIndex] = this._parent.RightExpression;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.LeftExpression == item))
                {
                    this._parent.LeftExpression = null;
                    return true;
                }
                if ((this._parent.RightExpression == item))
                {
                    this._parent.RightExpression = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.LeftExpression).Concat(this._parent.RightExpression).GetEnumerator();
            }
        }
        
        /// <summary>
        /// The collection class to to represent the children of the BinaryOperation class
        /// </summary>
        public class BinaryOperationReferencedElementsCollection : ReferenceCollection, ICollectionExpression<IModelElement>, ICollection<IModelElement>
        {
            
            private BinaryOperation _parent;
            
            /// <summary>
            /// Creates a new instance
            /// </summary>
            public BinaryOperationReferencedElementsCollection(BinaryOperation parent)
            {
                this._parent = parent;
            }
            
            /// <summary>
            /// Gets the amount of elements contained in this collection
            /// </summary>
            public override int Count
            {
                get
                {
                    int count = 0;
                    if ((this._parent.LeftExpression != null))
                    {
                        count = (count + 1);
                    }
                    if ((this._parent.RightExpression != null))
                    {
                        count = (count + 1);
                    }
                    return count;
                }
            }
            
            protected override void AttachCore()
            {
                this._parent.LeftExpressionChanged += this.PropagateValueChanges;
                this._parent.RightExpressionChanged += this.PropagateValueChanges;
            }
            
            protected override void DetachCore()
            {
                this._parent.LeftExpressionChanged -= this.PropagateValueChanges;
                this._parent.RightExpressionChanged -= this.PropagateValueChanges;
            }
            
            /// <summary>
            /// Adds the given element to the collection
            /// </summary>
            /// <param name="item">The item to add</param>
            public override void Add(IModelElement item)
            {
                if ((this._parent.LeftExpression == null))
                {
                    IExpression leftExpressionCasted = item.As<IExpression>();
                    if ((leftExpressionCasted != null))
                    {
                        this._parent.LeftExpression = leftExpressionCasted;
                        return;
                    }
                }
                if ((this._parent.RightExpression == null))
                {
                    IExpression rightExpressionCasted = item.As<IExpression>();
                    if ((rightExpressionCasted != null))
                    {
                        this._parent.RightExpression = rightExpressionCasted;
                        return;
                    }
                }
            }
            
            /// <summary>
            /// Clears the collection and resets all references that implement it.
            /// </summary>
            public override void Clear()
            {
                this._parent.LeftExpression = null;
                this._parent.RightExpression = null;
            }
            
            /// <summary>
            /// Gets a value indicating whether the given element is contained in the collection
            /// </summary>
            /// <returns>True, if it is contained, otherwise False</returns>
            /// <param name="item">The item that should be looked out for</param>
            public override bool Contains(IModelElement item)
            {
                if ((item == this._parent.LeftExpression))
                {
                    return true;
                }
                if ((item == this._parent.RightExpression))
                {
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Copies the contents of the collection to the given array starting from the given array index
            /// </summary>
            /// <param name="array">The array in which the elements should be copied</param>
            /// <param name="arrayIndex">The starting index</param>
            public override void CopyTo(IModelElement[] array, int arrayIndex)
            {
                if ((this._parent.LeftExpression != null))
                {
                    array[arrayIndex] = this._parent.LeftExpression;
                    arrayIndex = (arrayIndex + 1);
                }
                if ((this._parent.RightExpression != null))
                {
                    array[arrayIndex] = this._parent.RightExpression;
                    arrayIndex = (arrayIndex + 1);
                }
            }
            
            /// <summary>
            /// Removes the given item from the collection
            /// </summary>
            /// <returns>True, if the item was removed, otherwise False</returns>
            /// <param name="item">The item that should be removed</param>
            public override bool Remove(IModelElement item)
            {
                if ((this._parent.LeftExpression == item))
                {
                    this._parent.LeftExpression = null;
                    return true;
                }
                if ((this._parent.RightExpression == item))
                {
                    this._parent.RightExpression = null;
                    return true;
                }
                return false;
            }
            
            /// <summary>
            /// Gets an enumerator that enumerates the collection
            /// </summary>
            /// <returns>A generic enumerator</returns>
            public override IEnumerator<IModelElement> GetEnumerator()
            {
                return Enumerable.Empty<IModelElement>().Concat(this._parent.LeftExpression).Concat(this._parent.RightExpression).GetEnumerator();
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the operator property
        /// </summary>
        private sealed class OperatorProxy : ModelPropertyChange<IBinaryOperation, Nullable<BinaryOperator>>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public OperatorProxy(IBinaryOperation modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override Nullable<BinaryOperator> Value
            {
                get
                {
                    return this.ModelElement.Operator;
                }
                set
                {
                    this.ModelElement.Operator = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.OperatorChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.OperatorChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the leftExpression property
        /// </summary>
        private sealed class LeftExpressionProxy : ModelPropertyChange<IBinaryOperation, IExpression>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public LeftExpressionProxy(IBinaryOperation modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IExpression Value
            {
                get
                {
                    return this.ModelElement.LeftExpression;
                }
                set
                {
                    this.ModelElement.LeftExpression = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.LeftExpressionChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.LeftExpressionChanged -= handler;
            }
        }
        
        /// <summary>
        /// Represents a proxy to represent an incremental access to the rightExpression property
        /// </summary>
        private sealed class RightExpressionProxy : ModelPropertyChange<IBinaryOperation, IExpression>
        {
            
            /// <summary>
            /// Creates a new observable property access proxy
            /// </summary>
            /// <param name="modelElement">The model instance element for which to create the property access proxy</param>
            public RightExpressionProxy(IBinaryOperation modelElement) : 
                    base(modelElement)
            {
            }
            
            /// <summary>
            /// Gets or sets the value of this expression
            /// </summary>
            public override IExpression Value
            {
                get
                {
                    return this.ModelElement.RightExpression;
                }
                set
                {
                    this.ModelElement.RightExpression = value;
                }
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be subscribed to the property change event</param>
            protected override void RegisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.RightExpressionChanged += handler;
            }
            
            /// <summary>
            /// Registers an event handler to subscribe specifically on the changed event for this property
            /// </summary>
            /// <param name="handler">The handler that should be unsubscribed from the property change event</param>
            protected override void UnregisterChangeEventHandler(System.EventHandler<NMF.Expressions.ValueChangedEventArgs> handler)
            {
                this.ModelElement.RightExpressionChanged -= handler;
            }
        }
    }
}
