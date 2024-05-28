import { useState } from "react";

const initProducts = [
    {
        name: 'Monitor samsung 65',
        price: 500,
        description: 'Monitor es increible'
    },
    {
        name: 'Iphone 15 Pro',
        price: 1200,
        description: 'El telefono mas caro del mundo'
    }
]


export const ProductApp = () => {

    const [products, setProducts] = useState(initProducts);
    setProducts(initProducts)
    return (
        <>
        <h1>Hola Mundo React</h1>
        <table>
            <thead>
                <tr>
                    <th>name</th>
                    <th>description</th>
                    <th>price</th>
                </tr>
            </thead>
        </table>
        <tbody>
            {products.map(product =>  {
                return (<tr key={product.name}>
                <td>{product.name}</td>
                <td>{product.description}</td>
                <td>{product.price}</td>
            </tr>)
            })}
        </tbody>
        </>
    )
}