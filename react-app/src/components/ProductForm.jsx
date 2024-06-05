import { useEffect, useState } from "react";

const initialDateForm = {
    id: 0,
    name: '',
    description: '',
    price: ''
}
// eslint-disable-next-line react/prop-types
export const ProductForm = ({productSelected, handlerAdd}) => {

    const [form, setForm] = useState(initialDateForm);

    const {id, name, description, price } = form;

    useEffect(() => {
        setForm(productSelected);
    }, [productSelected])

    return (
        <form onSubmit={(event) => {
            event.preventDefault();

            if(!name || !description || !price) {
                alert('Please complete all fields');
                return;
            }
            //console.log(form)
            handlerAdd(form);
            setForm(initialDateForm);
        }}>
            <div>
                <input
                    placeholder="Name"
                    className="form-control my-3 w-50"
                    name="name"
                    value={name}
                    onChange={(event) => setForm({
                        ...form,
                        name: event.target.value
                    })}
                />
            </div>
            <div>
                <input
                    placeholder="Description"
                    className="form-control my-3 w-50"
                    name="description"
                    value={description}
                    onChange={(event) => setForm({
                        ...form,
                        description: event.target.value
                    })}
                />
            </div>
            <div>
                <input
                    placeholder="Price"
                    className="form-control my-3 w-50"
                    name="price"
                    value={price}
                    onChange={(event) => setForm({
                        ...form,
                        price: event.target.value
                    })}
                />

            </div>
            <div>
                <button type="submit" className="btn btn-primary">
                    {id> 0 ? 'Update' : 'Craete'}
                    </button>
            </div>
        </form>
    )

}