import { smsClient } from '.';


export const fetchClient = {
    testfetch: async () => {
        return await smsClient.get(`/matchhistory`);
    },
};
