import axios from 'axios';

const initProducts = [
    {
        id: 1,
        name: 'Monitor samsung 65',
        price: 500,
        description: 'Monitor es increible'
    },
    {
        id: 2,
        name: 'Iphone 15 Pro',
        price: 1200,
        description: 'El telefono mas caro del mundo'
    }
];

const baseUrl = 'http://localhost:8080/products';

export const listProduct = () => {
    return initProducts;
}

export const findAll = async () => {
    try {
        const response = await axios.get(baseUrl);
        return response;
    } catch (error) {
        console.error(error);
    }
    return null;
}

export const create = async ({name, description, price}) => {

    try {
        const response = await axios.post(baseUrl, {
            name,
            description,
            price
        });
        return response;
    } catch (error) {
        console.error(error);
    }
    return undefined;
}

export const update = async ({id, name, description, price}) => {

    try {
        const response = await axios.put(baseUrl + '/' + id, {
            name,
            description,
            price
        });
        return response;
    } catch (error) {
        console.error(error);
    }
    return undefined;
}

export const remove = async (id) => {
    try {
        await axios.delete(baseUrl + '/' + id);
    }catch(error) {
        console.error(error);
    }
}