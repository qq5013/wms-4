using System;
using System.Collections.Generic;
using System.Text;
using Dddml.Wms.Specialization;


namespace Dddml.Wms.Specialization
{
    public abstract class StateDtoCollectionBase<TDto> : StateDtoBase, IStateDto, ICollection<TDto> where TDto : StateDtoBase
    {
        private List<TDto> _collection = new List<TDto>();


        public virtual TDto[] ToArray()
        {
            return _collection.ToArray();
        }

        public override string ReturnedFieldsString
        {
            protected internal get
            {
                return base.ReturnedFieldsString;
            }
            set
            {
                base.ReturnedFieldsString = value;
                foreach (var item in _collection)
                {
                    item.ReturnedFieldsString = value;
                }
            }
        }

        IEnumerator<TDto> IEnumerable<TDto>.GetEnumerator()
        {
            return _collection.GetEnumerator();
        }

        System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
        {
            return _collection.GetEnumerator();
        }


        void ICollection<TDto>.Add(TDto item)
        {
            item.ReturnedFieldsString = this.ReturnedFieldsString;
            _collection.Add(item);
        }

        void ICollection<TDto>.Clear()
        {
            _collection.Clear();
        }

        bool ICollection<TDto>.Contains(TDto item)
        {
            return _collection.Contains(item);
        }

        void ICollection<TDto>.CopyTo(TDto[] array, int arrayIndex)
        {
            _collection.CopyTo(array, arrayIndex);
        }

        int ICollection<TDto>.Count
        {
            get { return _collection.Count; }
        }

        bool ICollection<TDto>.IsReadOnly
        {
            get { return (_collection as ICollection<TDto>).IsReadOnly; }
        }

        bool ICollection<TDto>.Remove(TDto item)
        {
            return _collection.Remove(item);
        }

    }
}
